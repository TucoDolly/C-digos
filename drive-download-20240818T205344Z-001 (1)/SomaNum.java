package br.edu.ifsc.ipr;
import java.util.Scanner;

public class SomaNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, soma = 0;
        do {
            System.out.println("Informe um numero: ");
            num = in.nextInt();
            soma += num;
        } while (num != 0);
        System.out.println("Soma: " + soma);          
    }
}
