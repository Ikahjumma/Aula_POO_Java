/**
 * O intituto de metereologia de SP precisa de um programa para 
 * calcular a temperatura da cidade de São Paulo.
 * Criar um Programa
 * Array com 12 meses
 * Inserido a temperatura de cada mês
 * Calculada a média das temperaturas
**/
package com.mycompany.mediatemperatura;
import java.util.Scanner;

public class MediaTemperatura {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        //Declarar o vetor
        int [] vetor = new int[12];
        int soma=0;
        
        //entrada de dados
        for(int i=0; i< vetor.length; i++) {
            System.out.println("Digite a temperatura do " + (i+1) +"º mês: ");
            vetor[i] = ent.nextInt();
            soma = (vetor[i] + soma);
            
        }
        // Calcular a médias das idades
        System.out.println("Média da temperatura da Cidade de SP = " + (soma/vetor.length) +"ºC");
    }
}
