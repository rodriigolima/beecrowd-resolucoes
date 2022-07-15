package iniciante;

import java.io.IOException;
import java.util.Scanner;

/*Leia um valor inteiro correspondente à idade de uma pessoa em dias 
e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 
365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação 
que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício 
com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido*/

public class IdadeEmDias {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
        int dia, ano, mes;
        dia = input.nextInt();

        ano = dia / 365;
        mes = dia % 365 / 30;
        dia = dia % 365 % 30;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

        input.close();

    }
}
