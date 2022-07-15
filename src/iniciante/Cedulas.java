package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, 
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, 
caso contrário seu programa apresentará a mensagem: “Presentation Error”.*/

public class Cedulas {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        int x, cem, cin, vin, ten, five, two;

        x = input.nextInt();

        System.out.println(x);
        
        cem = x / 100;
        x -= (cem*100);
        cin = x / 50;
        x -= (cin*50);
        vin = x / 20;
        x -= (vin*20);
        ten = x / 10;
        x -= (ten*10);
        five = x / 5;
        x -= (five*5);
        two = x / 2;
        x -= (two*2);
        
        System.out.printf("%d nota(s) de R$ 100,00\n", cem);
        System.out.printf("%d nota(s) de R$ 50,00\n", cin);
        System.out.printf("%d nota(s) de R$ 20,00\n", vin);
        System.out.printf("%d nota(s) de R$ 10,00\n", ten);
        System.out.printf("%d nota(s) de R$ 5,00\n", five);
        System.out.printf("%d nota(s) de R$ 2,00\n", two);
        System.out.printf("%d nota(s) de R$ 1,00\n", x); 
        
        input.close();
    }    
}
