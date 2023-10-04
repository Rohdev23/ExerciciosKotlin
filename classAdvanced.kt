class Pessoa {
   var nome = ""
   var idade: Int = 0

   fun aniversario(){
      idade++
   }

   fun informacoes(){
      println("$nome tem $idade anos")

   }

   fun proximoAno(){
      println("É $nome o tempo passa rápido, ano que vem você faz $idade\n")
   }
}

fun criarPessoa(): Pair <String, Int>{
     print("Digite seu nome: ")
     val nome = readLine() ?: ""

     print("Digite a idade: ")
     val idade = readLine()?.toIntOrNull() ?: 0 

        return Pair(nome, idade)
}

fun main(){
     val (nome1, idade1) = criarPessoa()
     val pessoa1 = Pessoa()
        pessoa1.nome = nome1
        pessoa1.idade = idade1

     val (nome2, idade2) = criarPessoa()
     val pessoa2 = Pessoa()
         pessoa2.nome = nome2
	 pessoa2.idade = idade2

pessoa1.informacoes()
pessoa1.aniversario()
pessoa1.proximoAno()

pessoa2.informacoes()
pessoa2.aniversario()
pessoa2.proximoAno()



