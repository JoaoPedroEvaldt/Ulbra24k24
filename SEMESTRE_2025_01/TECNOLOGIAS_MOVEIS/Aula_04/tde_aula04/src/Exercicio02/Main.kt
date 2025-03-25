package Exercicio02

fun numerosPares(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 == 0 }
}

fun main() {
    val listaNumeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Pares: ${numerosPares(listaNumeros)}")
}
