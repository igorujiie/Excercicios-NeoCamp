package com.meli.dia1.conceitoJava;

import java.util.Scanner;

public class Ex1 {

    // Crie um programa que preencha uma matriz 3x3 com números inteiros fornecidos pelo usuário. Em
    //seguida, calcule e exiba a soma de todos os elementos da matriz e a soma de cada linha.

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("preenchendo os vslores da matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor a ser inserido na posicao %d x %d: ", i, j);
                matriz[i][j] = scanner.nextInt();
                //System.out.println(matriz[i][j]);

            }

        }

        System.out.println("Exibindo a Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Calculo da soma total");
        int somaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaTotal += matriz[i][j];
            }

        }
        System.out.println("Soma total = " + somaTotal);
        System.out.println();

        System.out.println("Calculo da soma por linha");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("soma da linha %d = %d\n", i, somaLinha);
        }

    }



}
