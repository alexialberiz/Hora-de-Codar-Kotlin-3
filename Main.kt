//2 - Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0.
// No final da repetição escreva "EXPLOSÃO".


fun main() {
    var indice : Int? = 0
    println("Contagem Regressiva. OLHAAA A BOMBAAA!! ")
    for(indice in 30 downTo 1) {
        println(indice)
    }
    println("EXPLOSÃOOOOOOOO!")
}
