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

fun criarPessoa(): Pair<String, Int> {
    print("Digite o nome da pessoa: ")
    val nome = readLine() ?: ""

    print("Digite a idade da pessoa: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    return Pair(nome, idade)
}

fun main() {
    val (nome1, idade1) = criarPessoa()
    val (nome2, idade2) = criarPessoa()

    val pessoa1 = Pessoa()
    pessoa1.nome = nome1
    pessoa1.idade = idade1

    val pessoa2 = Pessoa()
    pessoa2.nome = nome2
    pessoa2.idade = idade2

    pessoa1.exibirInformacoes()
    pessoa1.realizarAniversario()
    pessoa1.exibirInformacoes()

    pessoa2.exibirInformacoes()
    pessoa2.realizarAniversario()
    pessoa2.exibirInformacoes()
}


