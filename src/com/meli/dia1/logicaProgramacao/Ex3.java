package com.meli.dia1.logicaProgramacao;

import java.util.Scanner;

public class Ex3 {
    //1. Fatorial de um Número:
    //○ Crie um programa que calcule o fatorial de um número dado.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Digite um numero para calculo do fatorial: ");
        int x = sc.nextInt();
        int y =1;
        for(int i =1; i <=x; i++){
            y = y*i;
        }
        System.out.printf("o resultado do fatorial de %d é = %d", x, y);

    }
}
