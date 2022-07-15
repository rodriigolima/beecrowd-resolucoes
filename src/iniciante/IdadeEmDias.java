package iniciante;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int dia = input.nextInt();

        int ano = dia / 365;
        int mes = dia % 365 / 30;
        dia = dia % 365 % 30;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

        input.close();

    }
}
