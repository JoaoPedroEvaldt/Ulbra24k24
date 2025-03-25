package Exercicio05

fun paraMaiusculas(lista: List<String>): List<String> {
    return lista.map { it.uppercase() }
}

fun main() {
    val listaStrings = listOf("oi", "teste", "palavra")
    println("Maiúsculas: ${paraMaiusculas(listaStrings)}")
}
