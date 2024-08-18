package br.edu.ifsc.iprrepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Informe um número: ");
        n = in.nextInt();
                
        for (int i = 1; i <= 10; i++) {
            int r = n * i;
            System.out.println(n + " * " + i + " = " + r);
        }
    }
}
