// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }


data class Usuarios (val nome1: String, val nome2: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuarios>()
    
    fun matricular(usuario: Usuarios) {
        inscritos.add(usuario)
    }
    
    fun getMatricular(){
        for(usuario in inscritos){
            println("Nome: ${usuario.nome1+" "+usuario.nome2} - |Email: ${usuario.email}|")
        }
    }
    
    fun printConteudoEducacional(){
        for (cont in conteudos)
        println("${cont.nome} - ${cont.duracao}min - (${cont.nivel})")
        }
    }

fun main() {
    val moduloKotlinB = ConteudoEducacional("Linguagem Kotlin", 120, Nivel.BASICO)
    val moduloAndroidStudioB = ConteudoEducacional("Fundamentos Android Studio", 120, Nivel.BASICO)
  	val moduloKotlinI = ConteudoEducacional("Linguagem Kotlin", 180, Nivel.INTERMEDIARIO)
  	val moduloAndroidStudioI = ConteudoEducacional("Fundamentos Multiscreen", 180, Nivel.INTERMEDIARIO)
    
    val listaDeConteudo = mutableListOf<ConteudoEducacional>()
  		listaDeConteudo.add(moduloKotlinB)
  		listaDeConteudo.add(moduloAndroidStudioB)
    	listaDeConteudo.add(moduloKotlinI)
  		listaDeConteudo.add(moduloAndroidStudioI)
        
    val Natalia = Usuarios("Natalia","Jobim", "natjborges@yahoo.com.br")
    val Marina = Usuarios("Marina","Martins", "ninacmartins@gmail.com")
    val Angelina = Usuarios("Angelina","Duarte", "angelinaduarte@gmail.com")
    
    val androidTraining = Formacao("Formação Android Developer", listaDeConteudo, Nivel.INTERMEDIARIO)
     
    androidTraining.matricular(Natalia)
    androidTraining.matricular(Marina)
    androidTraining.matricular(Angelina)
    
    println(" ----------------")
    println("${androidTraining.nome} - ${androidTraining.nivel}")
    println(" ----------------")
   
    println("Grade do curso")
    println(androidTraining.printConteudoEducacional())
    println(" ----------------")
   
    println("Usuarios cadastrados no curso")
    println(androidTraining.getMatricular())
}