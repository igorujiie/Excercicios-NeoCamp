package com.meli.dia1.logicaProgramacao;

import java.util.Scanner;

public class Ex2 {
    //1. Verificação de Número Par ou Ímpar:
    //○ Crie um programa que verifique se um número é par ou ímpar.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite um numero");

        int x = sc.nextInt();

        String parOuImpar = (x %2 ==0)? "Numero é par" : "numero é impar";
        System.out.println(parOuImpar);
    }
}
