package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class NotaseMoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        double N = input.nextDouble();

        System.out.print("NOTAS:\n");
        double cem = (int)  N / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", (int) cem);
        N -=  (cem*100);
        double cin = (int)  N / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", (int) cin);
        N -= (cin*50);
        double vin = (int) N / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", (int)  vin);
        N -= (vin*20);
        double ten = (int) N / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", (int) ten);
        N -= (ten*10);
        double five = (int)  N / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", (int) five);
        N -= (five*5);
        double two = (int) N / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", (int) two);
        N -= (two*2);
        if(N < 2){
            double sobras =  N * 100;
            System.out.print("MOEDAS:\n");
            double one = (int) sobras / 100;
            System.out.printf("%d moeda(s) de R$ 1.00\n", (int) one);
            sobras -= (one*100);
            double cinCent = (int)  sobras / 50;
            System.out.printf("%d moeda(s) de R$ 0.50\n", (int) cinCent);
            sobras -= (cinCent*50);
            double vinCent = (int)  sobras / 25;
            System.out.printf("%d moeda(s) de R$ 0.25\n", (int) vinCent);
            sobras -= (vinCent*25);
            double tenCent = (int)  sobras / 10;
            System.out.printf("%d moeda(s) de R$ 0.10\n", (int) tenCent);
            sobras -= (tenCent*10);
            double fiveCent = (int)  sobras / 5;
            System.out.printf("%d moeda(s) de R$ 0.05\n", (int)fiveCent);
            sobras -= (fiveCent*5);
            double oneCent = (int)  sobras / 1;
            System.out.printf("%d moeda(s) de R$ 0.01\n", (int) oneCent);
            
        }
        
        input.close();

    }
}
