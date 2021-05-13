package desafio8exer4resposta;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Desafio8Exer4resposta {
    /*Escrever um algoritmo que lê 10 valores, um de cada vez, e conta
      quantos deles estão no intervalo [10,20] e quantos deles estão fora do 
      intervalo, escrevendo estas informações.*/
    public static void main(String[] args) {
        int numeros, cont1020;
        Scanner ler = new Scanner(System.in);
        cont1020 = 0;
        System.out.println("Digite um numero positivo para continuar ou negativo para sair");
        numeros = ler.nextInt();
        while (numeros >= 0) {
            if(numeros >=10 && numeros  <= 20) {
                cont1020++;
            }
             System.out.println("Digite um numero positivo para continuar ou negativo para sair");
        numeros = ler.nextInt();
         }
    }
    
}
