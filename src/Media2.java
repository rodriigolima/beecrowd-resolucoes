import java.util.Locale;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        double media = ((n1*2) + (n2*3)+(n3*5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        input.close();
    }
}
