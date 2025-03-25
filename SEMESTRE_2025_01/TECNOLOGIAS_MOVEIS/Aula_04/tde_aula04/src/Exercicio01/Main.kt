package Exercicio01

fun media(lista: List<Double>): Double {
    return if (lista.isNotEmpty()) lista.average() else 0.0
}

fun main() {
    val numeros = listOf(10.0, 20.0, 30.0, 40.0, 50.0)
    println("Média: ${media(numeros)}")
}