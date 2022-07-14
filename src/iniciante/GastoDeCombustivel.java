package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int t = (int) input.nextDouble();
        int v = (int) input.nextDouble();

        double gasto = v*t; 
        double l = gasto/12;

        System.out.printf("%.3f\n", l);

        input.close();
    }
}
