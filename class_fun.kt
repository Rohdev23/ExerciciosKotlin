class Pessoa {
    var nome = ""
    var idade: Int = 0

    fun aniversario() {
        idade++
    }

    fun exibirInformacoes() {
        println("$nome tem $idade anos.")
    }
}

fun obterIdade(pessoa: Pessoa): Int {
    return pessoa.idade
}

fun main() {
    val pessoa = Pessoa()

    print("Digite seu nome: ")
    pessoa.nome = readLine() ?: ""

    print("Digite sua idade: ")
    pessoa.idade = readLine()?.toIntOrNull() ?: 0

    if (pessoa.idade < 1) {
        println("Idade inválida!")
        return
    }

    val pessoa2 = Pessoa()

    print("Digite seu nome 2: ")
    pessoa2.nome = readLine() ?: ""

    print("Digite sua idade: ")
    pessoa2.idade = readLine()?.toIntOrNull() ?: 0

    if (pessoa2.idade < 1) {
        println("Idade inválida!")
        return
    }

    pessoa.exibirInformacoes()
    pessoa.aniversario()
    pessoa.exibirInformacoes()

    pessoa2.exibirInformacoes()
    pessoa2.aniversario()
    pessoa2.exibirInformacoes()

    val idadeDaPessoa1 = obterIdade(pessoa)
    val idadeDaPessoa2 = obterIdade(pessoa2)

    println("A idade da primeira pessoa é $idadeDaPessoa1")
    println("A idade da segunda pessoa é $idadeDaPessoa2")
}

