package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final double pi = 3.14159;
        double raio = input.nextDouble();
         
        double area = pi * raio * raio;
        
        System.out.printf("A=%.4f%n", area);
        
        input.close();
    }

}