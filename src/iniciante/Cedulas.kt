package iniciante


/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a relação de notas necessárias.
Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha,
caso contrário seu programa apresentará a mensagem: “Presentation Error”.*/

import java.util.*

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)

    var x: Int = entrada.nextInt()

    val cem = x / 100
    x -= (cem * 100)
    val cin = x / 50
    x -= (cin * 50)
    val vin = x / 20
    x -= (vin * 20)
    val ten = x / 10
    x -= (ten * 10)
    val five = x / 5
    x -= (five * 5)
    val two = x / 2
    x -= (two * 2)

    println("$cem notas(s) de R$ 100,00")
    println("$cin notas(s) de R$ 50,00")
    println("$vin notas(s) de R$ 20,00")
    println("$ten notas(s) de R$ 10,00")
    println("$five notas(s) de R$ 5,00")
    println("$two notas(s) de R$ 2,00")
    println("$x notas(s) de R$ 1,00")
}