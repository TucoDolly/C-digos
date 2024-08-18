package br.edu.ifsc.ipr;

import java.util.Scanner;

public class VetorIdades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] idade = new int[5];
        String [] nomes = new String[5];
        int idx;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a " + (i + 1) + " idade: ");
            idade[i] = Integer.parseInt(in.nextLine());
            //in.nextLine();
            System.out.println("Informe o nome: ");
            nomes[i] = in.nextLine();
            //in.reset();
        }
        System.out.println("Informe um índice: ");
        idx = in.nextInt();
        System.out.println("Idade " + idx + ": " + idade[idx - 1]);
        System.out.println("Nome " + idx + ": " + nomes[idx - 1]);
    }
}
