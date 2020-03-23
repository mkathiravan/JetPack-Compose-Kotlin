# JetPack-Compose-Kotlin

Jetpack Compose is a modern toolkit for building native Android UI. Jetpack Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.

## Composable functions

Jetpack Compose is built around composable functions. These functions let you define your app's UI programmatically by describing its shape and data dependencies, rather than focusing on the process of the UI's construction. To create a composable function, just add the @Composable annotation to the function name.

Composable functions can only be called from within the scope of other composable functions. To make a function composable, add the @Composable annotation.

## Layouts

UI elements are hierarchical, with elements contained in other elements. In Compose, you build a UI hierarchy by calling composable functions from other composable functions.

## Material design

Compose is built to support material design principles. Many of its UI elements implement material design out of the box. In this lesson, you'll style your app with material widgets.
