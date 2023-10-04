class Pessoa {
    var nome = ""
    var idade: Int = 0

    fun realizarAniversario() {
        idade++
    }

    fun exibirInformacoes() {
        println("$nome tem $idade anos.")
    }
}

fun criarPessoa(): Pessoa {
    val pessoa = Pessoa()

    print("Digite o nome da pessoa: ")
    pessoa.nome = readLine() ?: ""

    print("Digite a idade da pessoa: ")
    pessoa.idade = readLine()?.toIntOrNull() ?: 0

    return pessoa
}

fun main() {
    val pessoa1 = criarPessoa()
    val pessoa2 = criarPessoa()

    if (pessoa1.idade < 1 || pessoa2.idade < 1) {
        println("Idade inválida!")
        return
    }

    pessoa1.exibirInformacoes()
    pessoa1.realizarAniversario()
    pessoa1.exibirInformacoes()

    pessoa2.exibirInformacoes()
    pessoa2.realizarAniversario()
    pessoa2.exibirInformacoes()
}

