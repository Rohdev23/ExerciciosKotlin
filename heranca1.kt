open class Funcionario(var nome: String, var salario: Int){
    open fun mostrarinfo(){
        println("Nome: $nome \nsalário R$$salario")
    }
}

class Patrao(nome: String, salario: Int,val email: String): Funcionario(nome,salario){
    override fun mostrarinfo(){
        println("Nome: $nome\nsalário R$$salario\nEmail: $email")
    }
}

fun main(){
    val funcionario = Funcionario("Lizandra",2000)
    val patrao = Patrao("Rodrigo",6000,"rodrigo.jetbrains@example.com")
     
    val patrao2 = Patrao("Aline",8000,"aline.jetbrains@example.com")
    patrao.mostrarinfo()
    funcionario.mostrarinfo()
    patrao2.mostrarinfo()

}
