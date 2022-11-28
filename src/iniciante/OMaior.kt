package iniciante

/*Faça um programa que leia três valores e apresente o maior dos três valores lidos
seguido da mensagem “eh o maior”. Utilize a fórmula:
MaiorAB = (a+b+abs(a-b))/2
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo,
portanto é necessário para chegar no resultado esperado.
Entrada
O arquivo de entrada contém três valores inteiros.
Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".*/

import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)

    val a: Int = entrada.nextInt()
    val b: Int = entrada.nextInt()
    val c: Int = entrada.nextInt()

    val maiorAB = (a + b + abs(a - b)) / 2
    val maiorXC = (c + maiorAB + abs(c - maiorAB)) / 2

    println("$maiorXC eh o maior")
}

