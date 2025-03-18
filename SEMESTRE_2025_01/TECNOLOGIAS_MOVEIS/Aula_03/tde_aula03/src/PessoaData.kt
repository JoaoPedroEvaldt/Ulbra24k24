package com.exercicios.pessoaDataClass

data class Pessoa(val nome: String, val idade: Int, val profissao: String, val cpf: String)

fun main() {
    val pessoa1 = Pessoa("João", 22, "Desenvolvedor", "123.456.789-00")
    val pessoa2 = pessoa1.copy(nome = "João Evaldt") // Criação de uma nova instância com o nome alterado
    println(pessoa2)
}
