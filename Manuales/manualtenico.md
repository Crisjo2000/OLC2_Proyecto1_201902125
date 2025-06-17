# Manual Técnico

## Descripción del programa

El proyecto consiste en el desarrollo de un intérprete completo para el lenguaje de programación V-lang Cherry, diseñado con una sintaxis inspirada en VLang pero optimizado para ofrecer un rendimiento eficiente incluso en entornos con recursos limitados. Este intérprete integra un entorno de desarrollo completo que permite a los usuarios crear, editar y ejecutar código de manera fluida, combinando las capacidades de un editor de código con resaltado de sintaxis con un sistema de ejecución robusto.

El núcleo del intérprete utiliza ANTLR para la generación automática de los analizadores léxico y sintáctico, basados en una gramática formal cuidadosamente diseñada que define con precisión todas las estructuras del lenguaje. El sistema completa el proceso de interpretación mediante la construcción de un Árbol de Sintaxis Abstracta (AST), seguido de una evaluación semántica exhaustiva y un mecanismo avanzado de manejo de errores que proporciona retroalimentación detallada.

Desarrollado completamente en Go (Golang), el intérprete aprovecha las fortalezas del lenguaje para ofrecer un rendimiento óptimo y un consumo eficiente de recursos. La arquitectura modular del sistema permite una fácil expansión y adaptación, manteniendo al mismo tiempo un diseño limpio y mantenible. Todo el conjunto forma una solución integrada que no solo interpreta código V-lang Cherry, sino que proporciona una experiencia de desarrollo completa y profesional.

## Herramientas utilizadas
El compilador Vlang fue desarrollado utilizando las siguientes tecnologías:

### Lenguaje de programación: Go (Golang)

- Versión 1.21 o superior

- Elegido por su eficiencia, tipado estático y facilidad para desarrollar herramientas de análisis de código

### Sistema operativo Linux 

- Entorno optimizado para desarrollo en Go

- Soporte nativo para herramientas de compilación

### Interfaz gráfica: Framework Fyne

- Biblioteca multiplataforma para construir aplicaciones GUI nativas

- Permite una experiencia de usuario consistente en diferentes sistemas operativos

### Para el análisis léxico y sintáctico:

#### ANTLR4 (Another Tool for Language Recognition)

- Generador de parsers utilizado para crear el analizador léxico y sintáctico

- Permite definir la gramática del lenguaje en un archivo .g4

## Diagrama flujo del programa


[Archivo Fuente] → [Lexer] → [Parser] → [AST] → [Visitor] → [Ejecución]


## Estructura del Visitor

El visitor principal (ReplVisitor) implementa la interfaz generada por ANTLR y contiene:

```go
type ReplVisitor struct {
    parser.BaseVlangVisitor  // Base generada por ANTLR4
    ScopeTrace  *ScopeTrace    // Manejo de ámbitos y variables
    CallStack   *CallStack     // Pila de llamadas a funciones 
    Console     *Console       // Manejo de entrada/salida
    ErrorTable  *ErrorTable    // Registro de errores
    StructNames []string       // Nombres de estructuras definidas
}
```
## Flujo de Ejecución
- Visita al nodo Programa: Inicia el proceso de interpretación

- Procesamiento de statements: Cada statement se evalúa secuencialmente

- Manejo de ámbitos: Se gestionan con ScopeTrace.PushScope() y PopScope()

## Manejo de Tipos
El sistema de tipos implementa la interfaz IVOR (Interfaz para Valores y Objetos del Runtime):

```go
type IVOR interface {
    Type() string
    Value() interface{}

}
```

### Manejo de Estructuras
Las estructuras se implementan mediante:

```go

```

```go
type Struct struct {
    Name   string
    Fields []*StructField
}

type StructField struct {
    Name     string
    Type     string
    IsPublic bool
}

```

### Sistema de Ámbitos
El ScopeTrace maneja:

- Variables globales y locales

- Funciones definidas

- Estructuras declaradas

- Validación de tipos


### Manejo de Errores
El ErrorTable registra:

- Errores léxicos/sintácticos

- Errores semánticos (tipos, ámbitos)

- Errores en tiempo de ejecución