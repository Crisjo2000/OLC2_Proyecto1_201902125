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
)

func main() {
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
