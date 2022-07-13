package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod = (int) input.nextDouble();
        int num1 = (int) input.nextDouble();
        double value1 = input.nextDouble();
        int cod2 = input.nextInt();
        int num2 = (int) input.nextDouble();
        double value2 = input.nextDouble();

        double valorTotal = (num1*value1) + (num2*value2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        input.close();

    }
    
}
