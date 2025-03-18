

class Pessoa(val nome: String, val idade: Int) {
    fun caminhar() {
        println("caminhando")
    }

    fun falar() {
        println("falando")
    }
}

fun main() {
    val pessoa = Pessoa("João", 22)
    pessoa.caminhar() // Saída: caminhando
    pessoa.falar() // Saída: falando
}
