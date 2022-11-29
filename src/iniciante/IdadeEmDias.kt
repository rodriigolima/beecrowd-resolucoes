package iniciante

/*Leia um valor inteiro correspondente à idade de uma pessoa em dias
e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com
365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação
que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício
com objetivo de testar raciocínio matemático simples.
Entrada
O arquivo de entrada contém um valor inteiro.
Saída
Imprima a saída conforme exemplo fornecido*/

import java.util.*

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)

    val N: Int = entrada.nextInt()

    val ano = N / 365
    val mes = N % 365 / 30
    val dia = N % 365 % 30

    println("$ano ano(s)")
    println("$mes mes(es)")
    println("$dia dia(s)")
}