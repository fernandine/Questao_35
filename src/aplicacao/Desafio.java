package aplicacao;

/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D.
***************************************************
Entrada
O arquivo de entrada cont�m 4 valores inteiros.
*************************************************
Sa�da
Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
    	
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
      
       
      int diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);
        
        
        leitor.close();
    }
	
}