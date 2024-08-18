package br.edu.ifsc.ipraulas;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, cont = 0, qtdMaiores = 0;

        cont++;
        System.out.println("Informe a idade da " + cont + " pessoa: ");
        idade = in.nextInt();
        if (!(idade >= 1 && idade <= 130)) {
            System.out.println("Idade inválida! Informe novamente: ");
            idade = in.nextInt();
        }
        if (idade >= 18) {
            qtdMaiores++;
        }

        cont++;
        System.out.println("Informe a idade da " + cont + " pessoa: ");
        idade = in.nextInt();
        if (!(idade >= 1 && idade <= 130)) {
            System.out.println("Idade inválida! Informe novamente: ");
            idade = in.nextInt();
        }
        if (idade >= 18) {
            qtdMaiores++;
        }

        cont++;
        System.out.println("Informe a idade da " + cont + " pessoa: ");
        idade = in.nextInt();
        if (!(idade >= 1 && idade <= 130)) {
            System.out.println("Idade inválida! Informe novamente: ");
            idade = in.nextInt();
        }
        if (idade >= 18) {
            qtdMaiores++;
        }

        cont++;
        System.out.println("Informe a idade da " + cont + " pessoa: ");
        idade = in.nextInt();
        if (!(idade >= 1 && idade <= 130)) {
            System.out.println("Idade inválida! Informe novamente: ");
            idade = in.nextInt();
        }
        if (idade >= 18) {
            qtdMaiores++;
        }
        
        cont++;
        System.out.println("Informe a idade da " + cont + " pessoa: ");
        idade = in.nextInt();
        if (!(idade >= 1 && idade <= 130)) {
            System.out.println("Idade inválida! Informe novamente: ");
            idade = in.nextInt();
        }
        if (idade >= 18) {
            qtdMaiores++;
        }
        
        System.out.println("Maiores de idade: " + qtdMaiores);
    }
}
