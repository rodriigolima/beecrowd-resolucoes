package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido 
para horas:minutos:segundos, conforme exemplo fornecido.*/

public class ConversaoDeTempo {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        int N, min, horas, segundos;

        N = (int) input.nextDouble();
    
        min = N / 60;
        horas = min / 60;
        min %= 60;
        segundos = N % 60;
        
        System.out.printf("%d:%d:%d\n", horas, min, segundos);
         
        input.close();

    }
}
