package br.edu.ifsc.ipr;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base, exp, r = 1;
        System.out.println("Informe a base: ");
        base = in.nextInt();
        System.out.println("Informe o expoente: ");
        exp = in.nextInt();
        for (int i = 0; i < exp; i++) {
            r =     r * base;
        }
        System.out.println("Resultado: " + r);
    }
}
