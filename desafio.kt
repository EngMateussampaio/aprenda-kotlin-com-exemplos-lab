
class Usuario(val nomeAluno: String, val idadeAluno: Int)

data class ConteudoEducacional(val nome: String, val aulas: Int)

data class curso(val nome: String, val conteudos: List<ConteudoEducacional>)

val inscritos = mutableListOf<String>()
val alunos: List<String> = inscritos

fun matricular(usuario: String) {
    inscritos.add(usuario)
}
fun adicionaraluno(): List<String> {
    return alunos
}

fun main() {

    val ConteudoEducacional: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("logica", 10),
        ConteudoEducacional("html", 5),
        ConteudoEducacional("css", 8),
        ConteudoEducacional("js", 15),
        ConteudoEducacional("php", 20)
    )
    val fullStack = curso("full stack", ConteudoEducacional)

    val aluno1 = Usuario("mateus", 22)
    val aluno2 = Usuario("maria", 19)
    val aluno3 = Usuario("Lucas", 15)

    matricular(aluno1.nomeAluno)
    matricular(aluno2.nomeAluno)
    matricular(aluno3.nomeAluno)

    println("Numero de alunos incritos: ${inscritos.size}")
    println("Alunos incristos ${inscritos}")
    println("Numeros de Materias no curso de full Stack ${ConteudoEducacional.size}")

    val Aula: Map<String, Int> = ConteudoEducacional.associate {
        Pair(it.nome, it.aulas)
    }
    println(Aula)
    
}