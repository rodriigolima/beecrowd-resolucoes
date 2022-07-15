package iniciante;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        System.out.println(x);
        int cem = x / 100;
        System.out.printf("%d nota(s) de R$ 100,00\n", cem);
        x -= (cem*100);
        int cin = x / 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", cin);
        x -= (cin*50);
        int vin = x / 20;
        System.out.printf("%d nota(s) de R$ 20,00\n", vin);
        x -= (vin*20);
        int ten = x / 10;
        System.out.printf("%d nota(s) de R$ 10,00\n", ten);
        x -= (ten*10);
        int five = x / 5;
        System.out.printf("%d nota(s) de R$ 5,00\n", five);
        x -= (five*5);
        int two = x / 2;
        System.out.printf("%d nota(s) de R$ 2,00\n", two);
        x -= (two*2);
        System.out.printf("%d nota(s) de R$ 1,00\n", x); 
    

        input.close();
    }    
}
