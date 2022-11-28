package iniciante

/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e
o salário do funcionário, com duas casas decimais.
Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário
recebe por hora trabalhada, respectivamente.
Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido,
com um espaço em branco antes e depois da igualdade. No caso do salário,
também deve haver um espaço em branco após o $.*/

import java.util.*

fun main(args: Array<String>) {

    Locale.setDefault(Locale.US)
    val entrada = Scanner(System.`in`)

    val num: Int = entrada.nextInt()
    val horas: Int = entrada.nextInt()
    val valor: Double = entrada.nextDouble()

    val salario: Double = horas * valor

    println("NUMBER = $num")
    println("SALARY = U$ ${String.format("%.2f", salario)}")
}