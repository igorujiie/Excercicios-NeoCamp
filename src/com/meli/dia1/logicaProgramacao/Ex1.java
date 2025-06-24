package com.meli.dia1.logicaProgramacao;

import java.util.Scanner;

public class Ex1 {

    //Exercícios Práticos
    //1. Calculadora Simples:
    //○ Crie um programa que solicite dois números e uma operação (+, -, *, /) e exiba o resultado.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("digite dois numeros inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("digite o operador");
        String simbolo = sc.next();

        switch (simbolo) {
            case "+":
                System.out.printf("A soma  é: %d", x + y);
                break;
            case"-":
                System.out.printf("A subtracao é", x-y);
                break;
            case "/":
                 System.out.printf("A divisao  é: %d", x / y);
                 break;
            case"*":
                System.out.printf("A multiplicacao é", x*y);
                break;


        }
    }

}
