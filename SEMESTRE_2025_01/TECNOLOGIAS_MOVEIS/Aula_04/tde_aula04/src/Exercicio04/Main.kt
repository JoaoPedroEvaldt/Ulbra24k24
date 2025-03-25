package Exercicio04

fun ultimoImpar(lista: List<Int>): Int? {
    return lista.reversed().find { it % 2 != 0 }
}

fun main() {
    val listaImpares = listOf(2, 4, 6, 7, 8)
    println("Último ímpar: ${ultimoImpar(listaImpares)}")
}
