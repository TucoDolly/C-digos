package br.edu.ifsc.iprrepeticao;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) { // repeticao para alunos
            double media = 0;
            for (int j = 1; j <= 2; j++) { // repeticao para notas
                System.out.println("Informe a nota " + j + " do aluno " + i);
                double nota = in.nextDouble();
                media = media + nota;
            }
            media = media / 2;
            System.out.println("Media do aluno " + i + " é " + media);
        }
    }
}
