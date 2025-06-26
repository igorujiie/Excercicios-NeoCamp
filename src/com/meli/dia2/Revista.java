package com.meli.dia2;

public class Revista extends Livro{
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Edicao: "+ edicao);
    }
}
