/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somar;
import java.util.Scanner; /* biblioteca/resgatar numeros, abrir espaço na memoria*/

/**
 *
 * @author AnaBe
 */
public class Somar {

    public static void main(String[] args) {//é o metodo que vai ler a classe
        int a, b, c = 0;//declarando variaveis
        Scanner s= new Scanner (System.in);//instancia de java.util.scanner para não escrever sempre
        System.out.println("Insira um valor inteiro para A: "); //tipo printf 
        a = s.nextInt();//leia A read/ scanf
        System.out.println("Insira um valor inteiro para B: "); //tipo printf
        b = s.nextInt();//leia B read
        c = a + b;//c -> a + b
        System.out.println("O resultado da soma de A+B é igual "+c);
        
 
    }
}
