// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 120)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 180)
    val conteudo3 = ConteudoEducacional("Algoritmos de Busca", 90)

    val formacao = Formacao("Ciência da Computação", listOf(conteudo1, conteudo2, conteudo3))

    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("Pedro")

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    println("Inscritos na formação: ${formacao.inscritos.joinToString { it.nome }}")
}
