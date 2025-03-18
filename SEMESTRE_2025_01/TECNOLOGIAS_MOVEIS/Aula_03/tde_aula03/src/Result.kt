sealed class Result{
    data class Sucesso(val data: String) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}

fun main(){
    val sucesso = Result.Sucesso("Operação bem-sucedida")
    val erro = Result.Error("Erro na operação")
    val carregando = Result.Loading

    println(sucesso)
    println(erro)
    println(carregando)
}
