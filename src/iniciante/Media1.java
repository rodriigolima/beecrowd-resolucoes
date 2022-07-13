package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        double media = ((n1*3.5) + (n2*7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        input.close();
    }
}
