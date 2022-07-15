package iniciante;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = (int) input.nextDouble();
    
        int min = N / 60;
        int horas = min / 60;
        min %= 60;
        int segundos = N % 60;
        System.out.printf("%d:%d:%d\n", horas, min, segundos);
         
        input.close();

    }
}
