fun main() {
    val cor = "blue" // Exemplo de entrada

    val traducao = when (cor.lowercase()) {
        "blue" -> "Azul"
        "red" -> "Vermelho"
        "green" -> "Verde"
        "yellow" -> "Amarelo"
        else -> "Cor desconhecida"
    }

    println(traducao)
}
