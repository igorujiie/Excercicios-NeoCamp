package com.meli.dia2;

public class Revista extends Item {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Edição: " + edicao);
        System.out.println("Tipo: Revista");
        System.out.println();
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

}
