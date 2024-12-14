package com.mycompany.areatrapezio;
import javax.swing.JOptionPane;

/* calcular area trapézio com swing */

public class AreaTrapezio {

    public static void main(String[] args) {
        String baseMaior1;
        String baseMenor1;
        String altura1;
        
        float areaT;
        
        baseMaior1=JOptionPane.showInputDialog("Valor Base Maior:  ");
        baseMenor1=JOptionPane.showInputDialog("Valor Base Menor:  ");    
        altura1=JOptionPane.showInputDialog("Valor da Altura:  ");
        
        float baseMaior = Float.parseFloat(baseMaior1);
        float baseMenor = Float.parseFloat(baseMenor1);
        float altura = Float.parseFloat(altura1);
        
        areaT = ((baseMaior + baseMenor) * altura)/ 2;
        
        JOptionPane.showMessageDialog(null,"A área do Trapezio é  " +areaT, "Resultado", JOptionPane.PLAIN_MESSAGE);
        
    }
}
