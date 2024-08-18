package br.edu.ifsc.ipr;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, seq = 1, soma = 0, qtd = 0;
        System.out.println("Informe a quantidade de impares (N): ");
        n = in.nextInt();
        do {
            if ((seq % 2) != 0) { // impar
                soma += seq; // soma o numero impar
                qtd++;       // conta quantos impares somou
            }
            seq++;
        } while (qtd < n);
        System.out.println("Soma dos impares: " + soma);  
    }
}
