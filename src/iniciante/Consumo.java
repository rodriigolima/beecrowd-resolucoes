package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int veloc = (int) input.nextDouble();
        double volum =input.nextDouble();

        double consumo = veloc / volum;

        System.out.printf("%.3f km/l", consumo);

        input.close();
    }
}
