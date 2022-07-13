package iniciante;
import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int h = (int) input.nextDouble();
        double p = input.nextDouble();

        double salario =  h*p;

        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f", salario);


        input.close();
    }
}
