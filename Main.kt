/*7 - Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno.
 * Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário. */

fun main() {
    var i : Int = 1
    var soma = 0.0

    while (i <= 6){
        println("Digite a ${i} ª nota (0 a 10): ")
        var nota = readln().toDouble()

        if(nota >= 0 && nota <= 10){
            soma = soma + nota
            i = i + 1
        } else {
            println("Nota inválida! Digite um número entre 0 e 10: ")
        }
    }
     var media = soma / 6
    println("Média do aluno: ${media}")
}