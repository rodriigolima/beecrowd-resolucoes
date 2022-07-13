package iniciante;
import java.util.Scanner;

public class SomaSimples {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int soma = a + b;

        System.out.printf("SOMA = %d\n", soma);


        input.close();

    }

}
