package br.edu.ifsc.ipr;
import java.util.Scanner;

public class ForComWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, f;
        System.out.println("Informe o numero inicial: ");
        i = in.nextInt();
        System.out.println("Informe o numero final: ");
        f = in.nextInt();
        
        while (i <= f) {
            System.out.println(i);
            i++;
        }
    }
}
