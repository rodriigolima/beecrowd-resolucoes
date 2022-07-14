package iniciante;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int d = input.nextInt();

        int t = d * 2;

        System.out.println(t + " minutos");

        input.close();
    }
}
