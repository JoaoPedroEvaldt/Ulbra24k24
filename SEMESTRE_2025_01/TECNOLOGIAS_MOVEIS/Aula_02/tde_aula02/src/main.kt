fun main(){
    val numeros = listOf(10, 20, 30, 40, 50)
    val media = if (numeros.isNotEmpty()) numeros.average() else 0.0
    println("Média: $media")
}