package br.edu.ifsc.ipr;

import java.util.Scanner;

public class Pesquisa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nota;
        int qtdUsuarios, qtdA = 0, qtdD = 0, qtdE = 0, idade, menorId = Integer.MAX_VALUE;
        int maiorIdD = 0, maiorIdA = 0;
        double media = 0.0;
        System.out.println("Quantas pessoas vão responder?");
        qtdUsuarios = in.nextInt();
        for (int i = 0; i < qtdUsuarios; i++) {
            System.out.println("Usuário número: " + (i+1));
            System.out.println("Informe a idade: ");
            idade = in.nextInt();
            printMenu();
            nota = in.next();
            if (nota.equalsIgnoreCase("A")) {
                qtdA++;
                if (idade > maiorIdA) {
                    maiorIdA = idade;
                }
            }
            if (nota.equalsIgnoreCase("D")) {
                media += idade;
                qtdD++;
                if (idade > maiorIdD) {
                    maiorIdD = idade;
                }
            }
            if (nota.equalsIgnoreCase("E")) {
                qtdE++;
                if (idade < menorId) {
                    menorId = idade;
                }
            }
        }
        if (qtdA > 0) {
            System.out.println("Qtd de respostas A: " + qtdA);
            System.out.println("Maior idade respostas A: " + maiorIdA);
        }
        if (qtdD > 0) {
            System.out.println("Média idade das respostas D: " + (media / qtdD));
            System.out.println("Maior idade respostas D: " + maiorIdD);
        }
        if (qtdE > 0) {
            double perc = ((double) qtdE / qtdUsuarios) * 100.0;
            System.out.println("Percentual : " + perc + 
                    " Menor idade: " + menorId);
        }
        
    }
    
    public static void printMenu() {
            System.out.println("Informe a nota conforme as opções abaixo: ");
            System.out.println("A - Ótimo");
            System.out.println("B - Bom");
            System.out.println("C - Regular");
            System.out.println("D - Ruim");
            System.out.println("E - Péssimo");
    }
}
