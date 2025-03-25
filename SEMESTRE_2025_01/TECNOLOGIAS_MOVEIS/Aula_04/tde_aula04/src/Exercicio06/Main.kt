package Exercicio06

fun String.maiusculas(): String {
    return this.uppercase()
}

fun main() {
    val texto = "teste"
    println("Maiúsculas com extensão: ${texto.maiusculas()}")
}
