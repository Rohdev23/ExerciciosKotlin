class NomeIdade{
     var nome = ""
     var idade: Int = 0

    fun info():Unit{
     println("Meu nome é $nome e minha idade $idade anos!")

    }

    fun aniversario(){
         idade++
    }
}

fun main(){
    val pessoa1 = NomeIdade()
    pessoa1.nome = "Lizandra"
    pessoa1.idade = 26

pessoa1.info()
pessoa1.aniversario()

}
