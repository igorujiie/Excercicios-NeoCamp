package com.meli.dia1.conceitoJava;

import java.util.*;

public class Ex3 {

    //● Crie um programa que armazene uma lista de pessoas (nome e idade) usando um Map.
    //1. Armazene as informações em um Map<String, Integer>, onde a chave é o nome e o
    //valor é a idade.
    //2. Use um Set para armazenar os nomes das pessoas com mais de 30 anos.
    //3. Exiba os nomes das pessoas que possuem mais de 30 anos, ordenados em ordem alfabética.

    public static void main(String[] args) {
        Map<String, Integer> pessoa = new HashMap<>();
        var sc = new Scanner(System.in);
        int loop =1;

        while (loop == 1){
            System.out.println("digite o nome da pessoa: ");
            String x = sc.nextLine();

            System.out.println("digite a idadde da pessoa");
            int y = sc.nextInt();

            pessoa.put(x, y);

            System.out.println("deseja continuar?\n Digite 1 - sim\n Digite 2 - nao");
            loop = sc.nextInt();
            sc.nextLine();


        }

        Set<String> maisQue30 = new HashSet<>();

        for (Map.Entry<String, Integer> idade : pessoa.entrySet()){
            if(idade.getValue() > 30){
                maisQue30.add(idade.getKey());
            }
        }
        System.out.println("Pessoas com mais de 30: " +maisQue30);

    }
}
