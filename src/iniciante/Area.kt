package iniciante

/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.
Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das
áreas descritas acima, sempre com mensagem correspondente e um espaço entre os
ois pontos e o valor. O valor calculado deve ser apresentado com
3 dígitos após o ponto decimal.*/

    import java.util.*
    import kotlin.math.pow

    fun main(args: Array<String>) {

        Locale.setDefault(Locale.US)
        val entrada = Scanner(System.`in`)
        val pi: Double = 3.14159

        val a: Double = entrada.nextDouble()
        val b: Double = entrada.nextDouble()
        val c: Double = entrada.nextDouble()

        val areaTriangulo: Double = a * c / 2
        val areaCirculo: Double = pi * c.pow( 2.0)
        val areaTrapezio: Double = (a + b) * c / 2
        val areaQuadrado: Double = b.pow(2.0)
        val areaRetangulo: Double = a * b


        println("TRIANGULO: ${String.format("%.3f", areaTriangulo)}")
        println("CIRCULO: ${String.format("%.3f", areaCirculo)}")
        println("TRAPEZIO: ${String.format("%.3f", areaTrapezio)}")
        println("QUADRADO: ${String.format("%.3f", areaQuadrado)}")
        println("RETANGULO: ${String.format("%.3f", areaRetangulo)}")
    }