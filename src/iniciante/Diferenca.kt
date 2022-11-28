package iniciante


/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do
produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Entrada
O arquivo de entrada contém 4 valores inteiros.
Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo,
com um espaço em branco antes e depois da igualdade.*/

import java.util.*

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)

    val a: Int = entrada.nextInt()
    val b: Int = entrada.nextInt()
    val c: Int = entrada.nextInt()
    val d: Int = entrada.nextInt()

    println("DIFERENCA = ${(a * b - c * d)}")
}