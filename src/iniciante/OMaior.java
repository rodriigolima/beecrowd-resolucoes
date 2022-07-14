package iniciante;

import java.util.Scanner;

public class OMaior {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int maiorAB = (a+b+ Math.abs(a-b))/ 2;
        int maiorXC = (c+maiorAB + Math.abs(c - maiorAB)) / 2;

        System.out.println(maiorXC + "eh o maior");

        input.close();

    }
    
}
