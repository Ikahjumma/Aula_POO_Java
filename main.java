package com.mycompany.livro;

public class main {
    public static void main(String[] args) {
        Livro livro =new Livro ("Good Omens: Belas Maldições", "Neil Gaiman e Terry Pratchett", 2022, 490);
        Livro livro2 =new Livro ("Cartas a Théo: Rebeldes e Malditos", "Van Gogh", 2021, 456);
        Livro livro3 =new Livro ("É impossível esquecer o que vivi", "Bruno Gouveia", 2019, 454);
        Livro livro4 =new Livro ("Beyond The Story Uma história dos 10 anos de BTS", "Myeongseok Kang e BTS", 2023, 527);
        
        livro.dadosLivro();
        livro2.dadosLivro();
        livro3.dadosLivro();
        livro4.dadosLivro();
    }
    
}
