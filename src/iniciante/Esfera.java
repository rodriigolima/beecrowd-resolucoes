package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;
        int R = (int) input.nextDouble();
        double volume = (4.0/3) * PI * R * R * R;

        System.out.printf("VOLUME = %.3f\n", volume);

        input.close();
    }
}
