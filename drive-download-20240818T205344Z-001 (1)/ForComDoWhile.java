package br.edu.ifsc.ipr;

import java.util.Scanner;

public class ForComDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, f;
        System.out.println("Informe o valor inicial: ");
        i = in.nextInt();
        System.out.println("Informe o valor final: ");
        f = in.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= f);
    }
}
