package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.*/

public class TestedeSelecao1 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        int A, B, C, D;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        if(B > C && D > A && C+D > A+B && C >0 && D > 0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

        input.close();

    }
}
