package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa 
um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis 
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. 
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, 
conforme exemplo fornecido.*/

public class NotaseMoedas {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double N, cem , cin, vin, ten, five, two,
        sobras, one, cinCent, vinCent, 
        tenCent, fiveCent, oneCent; 

        N = input.nextDouble();

        cem = (int)  N / 100;
        N -=  (cem*100);
        cin = (int)  N / 50;
        N -= (cin*50);
        vin = (int) N / 20;
        N -= (vin*20);
        ten = (int) N / 10;
        N -= (ten*10);
        five = (int)  N / 5;
        N -= (five*5);
        two = (int) N / 2;
        N -= (two*2);
        
        System.out.print("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", (int) cem);
        System.out.printf("%d nota(s) de R$ 50.00\n", (int) cin);
        System.out.printf("%d nota(s) de R$ 20.00\n", (int)  vin);
        System.out.printf("%d nota(s) de R$ 10.00\n", (int) ten);
        System.out.printf("%d nota(s) de R$ 5.00\n", (int) five);
        System.out.printf("%d nota(s) de R$ 2.00\n", (int) two);

        if(N < 2){
            sobras =  N * 100;
            one = (int) sobras / 100;
            sobras -= (one*100);
            cinCent = (int)  sobras / 50;
            sobras -= (cinCent*50);
            vinCent = (int)  sobras / 25;
            sobras -= (vinCent*25);
            tenCent = (int)  sobras / 10;
            sobras -= (tenCent*10);
            fiveCent = (int)  sobras / 5;
            sobras -= (fiveCent*5);
            oneCent = (int)  sobras / 1;

            System.out.print("MOEDAS:\n");
            System.out.printf("%d moeda(s) de R$ 1.00\n", (int) one);
            System.out.printf("%d moeda(s) de R$ 0.50\n", (int) cinCent);
            System.out.printf("%d moeda(s) de R$ 0.25\n", (int) vinCent);
            System.out.printf("%d moeda(s) de R$ 0.10\n", (int) tenCent);
            System.out.printf("%d moeda(s) de R$ 0.05\n", (int)fiveCent);
            System.out.printf("%d moeda(s) de R$ 0.01\n", (int) oneCent);
        }
        
        input.close();

    }
}
