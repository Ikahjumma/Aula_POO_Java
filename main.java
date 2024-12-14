/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author AnaBe
 */
public class main {
    public static void main(String[] args ){
        POO poo=new POO("CR7", 36, "123456789");
        /*POO é o objeto da classe POO.
        poo é a variavel da instancia 
        new é a invocação da instancia
        POO("nome", idade, "cpf") parametro
        */
        POO poo2=new POO("Messi", 38, "987654321");
       
    /*System.out.println("Nome da Pessoa: " +poo.nome);
    System.out.println("Idade da Pessoas: " +poo.idade);
    System.out.println("Nome da Pessoas: " +poo2.nome);
    System.out.println("Idade da Pessoas: " +poo2.idade);
    */
    poo.dadosPOO();
    poo2.dadosPOO();
    
    }
}
