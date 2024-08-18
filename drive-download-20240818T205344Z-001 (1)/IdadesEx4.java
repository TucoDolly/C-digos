package br.edu.ifsc.ipraulas;

import java.util.Scanner;

public class IdadesEx4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, nomeJovem;
        int idade, qtd = 0, somaIdades = 0, maiorIdade = 0, menorIdade;
        double mediaIdade = 0.0;
        
        qtd++;
        System.out.println("Informe o nome da " + qtd + " pessoa:");
        nome = in.next();
        System.out.println("Informe a idade da " + qtd + " pessoa:");
        idade = in.nextInt();
        somaIdades += idade;
        maiorIdade = idade;
        menorIdade = idade;
        nomeJovem = nome;
        //somaIdades = somaIdades + idade;
        
        qtd++;
        System.out.println("Informe o nome da " + qtd + " pessoa:");
        nome = in.next();
        System.out.println("Informe a idade da " + qtd + " pessoa:");
        idade = in.nextInt();
        somaIdades += idade;
        if (idade > maiorIdade) {
            maiorIdade = idade;
        }
        if (idade < menorIdade) {
            menorIdade = idade;
            nomeJovem = nome;
        }

        qtd++;
        System.out.println("Informe o nome da " + qtd + " pessoa:");
        nome = in.next();
        System.out.println("Informe a idade da " + qtd + " pessoa:");
        idade = in.nextInt();
        somaIdades += idade;
        if (idade > maiorIdade) {
            maiorIdade = idade;
        }
        if (idade < menorIdade) {
            menorIdade = idade;
            nomeJovem = nome;
        }
        
        mediaIdade = somaIdades / qtd;    
        System.out.println("Média das idade é: " + mediaIdade);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Nome da pessoa mais nova: " + nomeJovem);
    }
    
}
