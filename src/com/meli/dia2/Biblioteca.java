package com.meli.dia2;

//Difícil: Crie uma classe Biblioteca que armazena uma lista de livros e possui métodos para adicionar e listar os livros.
//Use um ArrayList<Livro> para armazenar os livros.
//Metodo adicionarLivro(Livro livro) para adicionar um livro à biblioteca.
//Metodo listarLivros() para listar todos os livros da biblioteca.

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca(){
        livros = new ArrayList<>();
    }



    public void menu() {
        Scanner sc = new Scanner(System.in);
        int loop = 1;
        while (loop == 1) {
            System.out.println("Escolha uma opcao");
            System.out.println("1- Adicionar Livro \n2- Listar Livros\n3- buscar livro por nome");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o titulo do livro: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o ano do livro: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome do autor do livro: ");
                    String autor = sc.nextLine();
                    Livro livro = new Livro(nome, autor, ano);

                    adicionarLivro(livro);
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    System.out.println("Digite o nome do livro: ");
                    String nomeLivro = sc.nextLine();
                    buscarLivroPorTitulo(nomeLivro);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Deseja continuar?\n1 - sim\n2 - não");
            loop = sc.nextInt();
        }
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("Nenhum livro encontrado");
        }
        else{
            for(Livro livro : livros){
                livro.exibirDetalhes();
            }
        }

    }

    public void buscarLivroPorTitulo(String titulo){
        boolean existe = false;
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                livro.exibirDetalhes();
                existe = true;
            }
        }
        if(!existe){
            System.out.println("esse livro nao existe na biblioteca");

        }
    }

}
