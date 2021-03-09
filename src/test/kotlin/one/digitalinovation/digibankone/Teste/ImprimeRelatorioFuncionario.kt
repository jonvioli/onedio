package one.digitalinovation.digibankone.Teste

import one.digitalinovation.digibankone.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}