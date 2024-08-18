package br.edu.ifsc.ipr;

import java.util.Scanner;

public class PotenciaSoma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base, exp, r, s;
        System.out.println("Base: ");
        base = in.nextInt();
        System.out.println("Expoente: ");
        exp = in.nextInt();
        r = base;
        for (int i = 0; i < exp - 1; i++) {
            s = 0;
            for (int j = 0; j < base; j++) {
                s = s + r;
            }
            r = s;
        }
        System.out.println("Resultado: " + r);
    }
}
