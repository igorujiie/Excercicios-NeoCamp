package com.meli.dia2;
//Fácil: Crie uma classe Livro com os seguintes atributos:
//titulo (String)
//autor (String)
//anoPublicacao (int)
//Médio: Adicione métodos na classe Livro:
//Um método exibirDetalhes() que imprime os detalhes do livro.

public class Livro extends Item {
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Livro");
        System.out.println();
    }

    @Override
    public String getTipo() {
        return "Livro";
    }

}
