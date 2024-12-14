

package com.mycompany.poo;

public class POO {

    String nome; // inserir nome do tipo string
    int idade; // int pois é numero inteiro
    String cpf; //cadeira de caracteres
    
    public POO (String nome, int idade, String cpf) {
        super ();
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }
    void dadosPOO (){
        System.out.println("Nome da pessoas: " +nome);
        System.out.println("Idade da Pessoa: " +idade);
        
    }
}
