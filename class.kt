class Pessoa {
     var nome = ""
     var idade: Int = 0

     fun aniversario(){

        idade++
     }
}

fun main(){
    //Pessoa primeira instância
    val pessoa = Pessoa()
     print("Digite seu nome: ")
     pessoa.nome = readLine() ?: ""
     print("Digite sua idade: ")
     pessoa.idade = readLine()?.toIntOrNull() ?: 0
     if(pessoa.idade <1 ){
       print("Idade invalida!")
       return
     }

     //Pessoa segunda instância
     print("Digite seu nome 2: ")
    val pessoa2 = Pessoa()
     pessoa2.nome = readLine() ?: ""
     print("Digite sua idade: ")
     pessoa2.idade = readLine()?.toIntOrNull() ?: 0
     if (pessoa2.idade <1){
        print("Idade Invalida!")
        return
     }

     //A primeira Pessoa
     println("${pessoa.nome} tem ${pessoa.idade} anos")
     
       pessoa.aniversario()

     println("${pessoa.nome} agora tem ${pessoa.idade} anos")
        pessoa.aniversario()

     println("Mais um ano se passou, e agora ${pessoa.nome} tem ${pessoa.idade} anos\n")

     // A segunda Pessoa
     println("${pessoa2.nome} tem ${pessoa2.idade} anos")

        pessoa2.aniversario()

     println("${pessoa2.nome} agora tem ${pessoa2.idade} anos")

        pessoa2.aniversario()

     println("É ${pessoa2.nome}, os anos passam rápido, próximo ano você terá ${pessoa2.idade}")

}

