package com.meli.dia2;
//Fácil: Crie uma classe Livro com os seguintes atributos:
//titulo (String)
//autor (String)
//anoPublicacao (int)
//Médio: Adicione métodos na classe Livro:
//Um método exibirDetalhes() que imprime os detalhes do livro.

public class Livro {


    private  String titulo;
    private  String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
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

    public void exibirDetalhes() {
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Ano de Publicação: " +anoPublicacao);
        System.out.println();
        System.out.println();
    }
}
