package com.mycompany.livro;

public class Livro {
    String Titulo_livro, nome_autor;
    int ano_publicação, numero_paginas;
    
    public Livro (String Titulo_livro, String nome_autor, int ano_publicação, int numero_paginas ) {
        super();
        this.Titulo_livro=Titulo_livro;
        this.nome_autor=nome_autor;
        this.ano_publicação=ano_publicação;
        this.numero_paginas=numero_paginas;
    }
    
    void dadosLivro() {
        System.out.println("Titulo do livro:" +Titulo_livro);
        System.out.println("Nome do autor:" +nome_autor);
        System.out.println("Ano de publicação:" +ano_publicação);
        System.out.println("Número de páginas do livro:" +numero_paginas);
    }
}
