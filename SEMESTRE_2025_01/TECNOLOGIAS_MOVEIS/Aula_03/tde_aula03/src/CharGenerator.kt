class CharGenerator (val min: Int, val max : Int){
    fun generateChar() : Char {
        val randomInt = (min ..max) .random()
        return randomInt.toChar()
    }
}

fun main(){
    val charGen = CharGenerator(65, 90 )
    println(charGen.generateChar())
}