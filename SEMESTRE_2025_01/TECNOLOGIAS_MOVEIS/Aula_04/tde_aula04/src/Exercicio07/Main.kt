package Exercicio07

fun String.adicionarMoeda(): String {
    return "R$ $this"
}

fun main() {
    val numeroComMoeda = "100"
    println("Número com moeda: ${numeroComMoeda.adicionarMoeda()}")
}
