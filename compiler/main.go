package main

import (
	"fyne.io/fyne/v2"
	"fyne.io/fyne/v2/app"
)

func main() {
	//Inicio de la ventana
	a := app.New()

	w := a.NewWindow("V-Lang Cherry")
	w.Resize(fyne.NewSize(800, 600))

	w.ShowAndRun()
}
