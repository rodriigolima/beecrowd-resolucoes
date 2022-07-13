package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String n = input.nextLine();
        double s =  input.nextDouble();
        double b = input.nextDouble();

        double salarioComBonus =  b*15/100 + s;

        System.out.printf("TOTAL = R$ %.2f", salarioComBonus);


        input.close();
    }
}
