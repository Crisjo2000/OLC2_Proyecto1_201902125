package main

import (
	"io"
	"io/ioutil"

	"fyne.io/fyne/v2"
	"fyne.io/fyne/v2/app"
	"fyne.io/fyne/v2/container"
	"fyne.io/fyne/v2/dialog"
	"fyne.io/fyne/v2/storage"
	"fyne.io/fyne/v2/widget"

	"fmt"
	"os"

	compiler "compiler/parser"
	//repl "compiler/repl"
	repl "compiler/repl"

	//"main/cst"
	"compiler/errors"

	//"main/cst"
	//"compiler/errors"
	// "main/repl"

	"github.com/antlr4-go/antlr/v4"
)

func main() {

	// --------------------- ANALIZADORES ------------------------
	// inicializamos la aplicacion con fiber

	// Leer código fuente desde archivo o consola
	fmt.Println("Escribe el codigo de Vlang: (Ctrl+D) para terminar")
	inputCode, err := readStdin()
	fmt.Println("entrada: ", inputCode)
	if err != nil {
		fmt.Println("Error leyendo entrada:", err)
		return
	}

	//startTime := time.Now()

	// Canal para generar CST en paralelo (opcional)

	// 1. Análisis Léxico
	// Para verificar errores
	lexicalErrorListener := errors.NewLexicalErrorListener()
	//
	lexer := compiler.NewVlangLexer(antlr.NewInputStream(inputCode))
	fmt.Println("Se inicio el analisis lexico")
	fmt.Println("Lexer creado: ", lexer)
	lexer.RemoveErrorListeners()
	lexer.AddErrorListener(lexicalErrorListener)
	fmt.Println("Se termino el analisis lexico")
	fmt.Println("Erroree lex: ", lexicalErrorListener.ErrorTable, " ", lexicalErrorListener)

	// 2. Tokens
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	fmt.Println("Tokens encontrados: ", stream.GetAllTokens())

	// 3. Parser + errores sintácticos
	// New<Nombre de mi gramatica>(Stream)
	parser := compiler.NewVlangParser(stream)
	parser.BuildParseTrees = true

	syntaxErrorListener := errors.NewSyntaxErrorListener(lexicalErrorListener.ErrorTable)
	parser.RemoveErrorListeners()
	parser.SetErrorHandler(errors.NewCustomErrorStrategy())
	parser.AddErrorListener(syntaxErrorListener)
	fmt.Println("Se termino el analisis sintactico")

	// 4. Árbol sintáctico
	// En tu gramatica tienes el axioma, o simbolo inicial
	// Este es el que deberas agregar como parte del parser.
	arbolito := parser.Programa()

	// imprimimos los errores de sintaxis y léxicos
	visitor := repl.NewReplVisitor()
	visitor.Visit(arbolito)

	// -------------------- INTERFAZ --------------------
	//Inicio de la ventana
	a := app.NewWithID("ocl2.vlang.cherry")

	w := a.NewWindow("V-Lang Cherry")

	ta1 := widget.NewMultiLineEntry()
	ta1.SetPlaceHolder("Escribe tu código aquí...")
	ta1.Resize(fyne.NewSize(770, 700))
	ta1.Move(fyne.NewPos(10, 10))

	ta2 := widget.NewMultiLineEntry()
	ta2.SetPlaceHolder("")
	ta2.Disable()
	ta2.Resize(fyne.NewSize(770, 700))
	ta2.Move(fyne.NewPos(810, 10))

	b1 := widget.NewButton("Ejecutar", func() {
		// Aquí se llamaría a la función que ejecuta el código
	})
	b1.Resize(fyne.NewSize(150, 45))
	b1.Move(fyne.NewPos(720, 730))

	menu := fyne.NewMainMenu(
		fyne.NewMenu("Archivo",
			fyne.NewMenuItem("Crear Archivo", func() {
				ta1.SetText("")
				ta2.SetText("")
			}),
			fyne.NewMenuItem("Abrir archivo", func() {
				fd := dialog.NewFileOpen(func(reader fyne.URIReadCloser, err error) {
					if err != nil {
						dialog.ShowError(err, w)
						return
					}
					if reader == nil {
						return // el usuario canceló
					}

					defer reader.Close()
					data, err := ioutil.ReadAll(reader)
					if err != nil {
						dialog.ShowError(err, w)
						return
					}
					ta1.SetText(string(data))
				}, w)

				fd.SetFilter(storage.NewExtensionFileFilter([]string{".vch"}))
				fd.Show()
			}),
			fyne.NewMenuItem("Guardar archivo", func() {
				fd := dialog.NewFileSave(func(writer fyne.URIWriteCloser, err error) {
					if err != nil {
						dialog.ShowError(err, w)
						return
					}
					if writer == nil {
						return // usuario canceló
					}

					// Escribir el contenido
					_, err = io.WriteString(writer, ta1.Text)
					if err != nil {
						dialog.ShowError(err, w)
						return
					}
					writer.Close()
				}, w)

				fd.SetFileName("archivo.vch") // nombre por defecto
				fd.SetFilter(storage.NewExtensionFileFilter([]string{".vch"}))
				fd.Show()
			}),
		),
		fyne.NewMenu("Reportes",
			fyne.NewMenuItem("Errores", func() {
				// funcion para el reporte de errores
			}),
			fyne.NewMenuItem("Tabla de Símbolos", func() {
				//funcion para el reporte de tabla de símbolos
			}),
			fyne.NewMenuItem("AST", func() {
				//funcion para generar el reporte de AST
			}),
		),
	)

	w.SetMainMenu(menu)
	content := container.NewWithoutLayout(
		ta1,
		ta2,
		b1,
	)

	w.SetContent(content)
	w.Resize(fyne.NewSize(1920, 1080))
	w.ShowAndRun()

}

func readStdin2() (string, error) {
	input, err := io.ReadAll(os.Stdin)
	if err != nil {
		return "", err
	}
	return string(input), nil
}
func readStdin() (string, error) {
	input, err := os.ReadFile("/dev/stdin")
	return string(input), err
}

// Funciones para visualizar nuestro arbol
func PrintVerticalTree(node antlr.Tree, ruleNames []string) {
	printVerticalNode(node, ruleNames, "", true)
}

func printVerticalNode(node antlr.Tree, ruleNames []string, prefix string, isLast bool) {
	connector := "+-- "
	if !isLast {
		connector = "|-- "
	}

	var label string
	switch n := node.(type) {
	case antlr.RuleNode:
		label = ruleNames[n.GetRuleContext().GetRuleIndex()]
	case antlr.TerminalNode:
		label = fmt.Sprintf("\"%s\"", n.GetText())
	default:
		label = fmt.Sprintf("%T", n)
	}

	fmt.Printf("%s%s%s\n", prefix, connector, label)

	// Actualizar el prefijo para los hijos
	childCount := node.GetChildCount()
	for i := 0; i < childCount; i++ {
		child := node.GetChild(i)
		newPrefix := prefix
		if isLast {
			newPrefix += "    "
		} else {
			newPrefix += "|   "
		}
		printVerticalNode(child, ruleNames, newPrefix, i == childCount-1)
	}
}
