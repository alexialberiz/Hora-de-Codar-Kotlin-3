/*6 - Escreva um programa para ler 2 notas de um aluno,
calcular e imprimir a média final.
Considere que a nota de aprovação é 9,5.
Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?"
e solicitar um resposta. Se a resposta for "S",
o programa deve ser executado novamente,
caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.*/



fun main() {

    var media : Double
    var aprovados : Int = 0
    var resposta : String = "Sim"

    while (resposta == "Sim" || resposta == "S" || resposta == "s" || resposta == "sim") {

    println("Entre com a primeira nota: ")
    var nota1 = readln().toDouble()
    println("Entre com a segunda nota: ")
    var nota2 = readln().toDouble()

    media = (nota1 + nota2) / 2

    if(media >= 9.5){
        println("Aprovado! Média final: ${media}")
        aprovados += 1
    } else {
        println("Reprovado! Média final: ${media}")
        }
        println("Deseja calcular a média de outro aluno?(Sim/Não): ")
        resposta = readln()
    }
        println("Quantidade de Aprovados: ${aprovados}")
}
