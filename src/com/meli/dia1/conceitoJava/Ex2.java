package com.meli.dia1.conceitoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {
    //● Crie um programa que receba uma lista de números inteiros do usuário e use streams para:
    //1. Filtrar os números ímpares.
    //2. Dobrar os valores dos números ímpares.
    //3. Ordenar os números resultados em ordem crescente.
    //4. Exibir a lista final.

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Popule a lista com numeros inteiros: ");

        ArrayList<Integer> lista = new ArrayList();
        int loop =0;

        do{
            System.out.println("digite um numro para lista: ");
            int x = scanner.nextInt();
            lista.add(x);
            System.out.println(lista);
            System.out.println("deseja continuar?\n Digite 1 - sim\n Digite 2 - nao");
            loop = scanner.nextInt();


        }while (loop == 1);

        List<Integer> listaComStream =  lista.stream().
                filter(x -> x%2 !=0)
                .map(x-> x*2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista Final com as modificações" + listaComStream);

    }


}
