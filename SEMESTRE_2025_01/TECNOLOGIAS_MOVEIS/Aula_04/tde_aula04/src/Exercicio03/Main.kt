package Exercicio03

fun removerDuplicados(lista: List<Int>): List<Int> {
    return lista.distinct()
}

fun main() {
    val listaDuplicada = listOf(1, 2, 2, 3, 4, 4, 5)
    println("Sem duplicatas: ${removerDuplicados(listaDuplicada)}")
}
