package com.meli.dia2;

public abstract class Item implements ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Item(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract String getTipo();

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao>0){
            this.anoPublicacao = anoPublicacao;
        }else{
            System.out.println("O Ano de publicacao nao pode ser menor que zero");
        }
    }
}
