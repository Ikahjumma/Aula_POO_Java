/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;
import java.util.Scanner;
/**
 *
 * @author AnaBe
 */
public class IMC {

    public static void main(String[] args) {
        float altura = 0, peso=0, imc;
     
        Scanner s= new Scanner (System.in);
        System.out.println("Insira o valor dp seu peso: ");  
        peso = s.nextFloat();
        System.out.println("Insira o valor da sua altura: "); 
        altura = s.nextFloat();
        
        imc = peso / (altura*altura);
        System.out.println(imc);

        if (imc >= 30) {
            System.out.println("Gordinho");   
        }else{
                System.out.println("Magrinho");
        }
    }
    
}
