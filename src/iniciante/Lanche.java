package iniciante;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

CÓDIGO | ESPECIFICAÇÃO    |  PREÇO
1        Cachorro Quente    R$ 4.00
2        X-Salada           R$ 4.50
3        X-Bacon            R$ 5.00
4        Torrada simples    R$ 2.00
5        Refrigerante       R$ 1.50   

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.*/

public class Lanche {

    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod, qtd;

        cod = input.nextInt();
        qtd = input.nextInt();

        switch (cod) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", (double) qtd*4.0);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", (double) qtd*4.5);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", (double) qtd*5.0);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", (double) qtd*2.0);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", (double) qtd*1.5);
                break;         
        }

        input.close();

    }
}
