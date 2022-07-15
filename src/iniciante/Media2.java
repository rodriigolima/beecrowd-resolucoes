package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem 
peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, 
sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o 
ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, 
não esqueça de imprimir o fim de linha após o resultado, caso contrário, 
você receberá "Presentation Error".*/



public class Media2 {
    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double n1, n2, n3, media;

        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        media = ((n1*2) + (n2*3)+(n3*5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        input.close();
    }
}
