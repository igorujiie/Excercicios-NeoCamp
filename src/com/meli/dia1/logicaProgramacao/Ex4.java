package com.meli.dia1.logicaProgramacao;

import java.util.Scanner;

public class Ex4 {
    //1. Tabuada:
    //○ Crie um programa que exiba a tabuada de 1 a 10 para um número dado.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro para tabuada:");

        int x = sc.nextInt();

        for (int i =1; i<=10; i++){
            System.out.printf("A tabuada de %d é --> %d x %d: %d\n", x,x,i,x*i);
        }
    }
}
