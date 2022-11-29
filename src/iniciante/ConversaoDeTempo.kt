package iniciante

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
Entrada
O arquivo de entrada contém um valor inteiro N.
Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido
para horas:minutos:segundos, conforme exemplo fornecido.*/

import java.util.*

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)
    val N: Int = entrada.nextInt()

    var minutos = N / 60

    val horas = minutos / 60
    minutos %= 60

    val segundos = N % 60

    println("$horas:$minutos:$segundos")
}