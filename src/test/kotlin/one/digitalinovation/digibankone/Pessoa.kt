package one.digitalinovation.digibankone

class Pessoa {
    var nome: String = "Jonatas"
    var cpf: String = "123.123.123-12"
    private set
}

fun main() {
    val Jonatas = Pessoa()
    println(Jonatas)
        println(Jonatas.nome)
        println(Jonatas.cpf)
    }