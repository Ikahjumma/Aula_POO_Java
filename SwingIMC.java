package com.mycompany.swingimc;
import javax.swing.JOptionPane;

/**LIÇÃO DE CASA
 * 
fazer o calculo do IMC utilizando o JOptionPane
IMC = Peso/(Altura*Altura)
Se maior que 30 gordinho senão magrnho
* 
 */
public class SwingIMC {

    public static void main(String[] args) {
        String altura1;
        String peso1;
       
        
        float IMC;
        
        altura1=JOptionPane.showInputDialog("Insira sua altura: ");
        peso1=JOptionPane.showInputDialog("Insira seu peso: ");
 
        float altura = Float.parseFloat(altura1);
        float peso = Float.parseFloat(peso1);
        
        IMC = peso / (altura * altura);
       
        if (IMC >= 30) {
            JOptionPane.showMessageDialog(null,"Você está gordinho, seu IMC é " + IMC, "Resultado", JOptionPane.PLAIN_MESSAGE);  
        }else{
            JOptionPane.showMessageDialog(null, "Você está magrinho, seu IMC é " + IMC, "Resultado", JOptionPane.PLAIN_MESSAGE);
        }
        System.exit(0); 
    } 
}
