package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*Faça um programa que leia três valores e apresente o maior dos três valores lidos 
seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a+b+abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, 
portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".*/

public class OMaior {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        int a, b, c, maiorAB, maiorXC;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        maiorAB = (a+b+ Math.abs(a-b))/ 2;
        maiorXC = (c+maiorAB + Math.abs(c - maiorAB)) / 2;

        System.out.println(maiorXC + "eh o maior");

        input.close();

    }
    
}
