package one.digitalinovation.digibankone.Teste

import one.digitalinovation.digibankone.Funcionario
import one.digitalinovation.digibankone.Pessoa

fun main() {
    val Jonatas = Pessoa(nome = "Jonatas Oliveira", cpf = "123.123.123-09")
    println(Jonatas.nome)
    println(Jonatas.cpf)


    val joao = Funcionario( nome: "Jonatas Oliveira", cpf: "123.123.123-09", BigDecimal.valueof( val: 2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}