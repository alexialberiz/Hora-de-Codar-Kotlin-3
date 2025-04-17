/*4 - Faça um algoritmo que calcule e escreva a média aritmética
dos números inteiros entre 15 (inclusive) e 100 (inclusive).
 */

fun main() {
    var indice = 0
    var soma = 0
    var quantidade = 0
    println("Calculo de Média de Números entre 15 e 100!")

    for (indice in 15 .. 100){
        soma += indice
        quantidade++
    }
    val media = soma.toDouble() / quantidade
    println("Média aritmética: $media")
}