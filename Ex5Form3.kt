/*5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário
e todos os números inteiros entre eles.
Considere que o primeiro sempre será menor que o segundo.*/

fun main() {

    var media_principal : Int?
    var i : Int?

    println("Entre com o primeiro valor: ")
    var valor1 = readln().toInt()
    println("Entre com o segundo valor: ")
    var valor2 = readln().toInt()

    while(valor1 > valor2){
        println("Primeiro valor maior que o segundo valor! Insira novamente o primeiro valor: ")
        valor1 = readln().toInt()
        println("Insira novamente o segundo valor: ")
        valor2 = readln().toInt()
    }
    if(valor1 <= valor2){
        media_principal = (valor1 + valor2)/2
        println("Média final dos dois números inseridos: ${media_principal}")
    }
    var contador : Int? = 0
    var soma : Int? = 0
    println("Números no intervalo de ${valor1} e ${valor2}: ")
    if (soma != null) {
        for(i in valor1..valor2){
            println("${i} ")
            soma += i
            contador = contador!! + 1
        }
    }
    var media_secundaria = (soma)?.div(contador!!)
    println("Média dos números no intervalo (incluindo $valor1 e $valor2): $media_secundaria")
}
