/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newclass;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author AnaBe
 */
public class NewClass {

    public static void main(String[] args) {
        int[] vet;
        String retorno;
        vet = new int [10];
        for (int i = 0; i<vet.length; i++) {
            retorno = JOptionPane.showInputDialog("Digite um valor: ");
            vet[i] = Integer.parseInt(retorno);
        }
        Arrays.sort(vet);
        System.out.println("Seu vetor ordenado: [");
        for (int i=0; i<vet.length; i++) {
            System.out.print(vet[i] + ",");
        }
        System.out.print("]");
        
    }
}
