/*
 * Desenvolva o código em java de um array que some as idades de cinco pessoas, 
utilizando a classe scanner.
 */

package com.mycompany.arrayidade;
import java.util.Scanner;

public class ArrayIdade {

    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        //Declarar o vetor
        int [] vetor = new int[5];
        int soma=0;
        
        //entrada de dados
        for(int i=0; i< vetor.length; i++) {
            System.out.print("Digite a " + (i+1) + "º idade: ");
            vetor[i] = idade.nextInt();
            soma = (vetor[i] + soma);
            
        }
        // Calcular a médias das idades
        System.out.println("Média das idades é: " + (soma/vetor.length));
    }
}
