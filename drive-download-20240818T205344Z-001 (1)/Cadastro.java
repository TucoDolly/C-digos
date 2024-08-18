package br.edu.ifsc.ipr;

import java.util.Arrays;
import java.util.Scanner;

public class Cadastro {
    static final int TAM = 20;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] idades = new int[TAM];
        String[] nomes = new String[TAM];
        String[] enderecos = new String[TAM];
        int opcao, idx;
        String nome;
        
        Arrays.fill(idades, 0);
        Arrays.fill(nomes, "");
        Arrays.fill(enderecos, "");

        do {
            exibeMenu();
            opcao = Integer.parseInt(in.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Informe o índice:");
                    idx = Integer.parseInt(in.nextLine());
                    System.out.println("Informe a " + (idx) + " idade: ");
                    idades[idx - 1] = Integer.parseInt(in.nextLine());
                    System.out.println("Informe o nome: ");
                    nomes[idx - 1] = in.nextLine();
                    System.out.println("Informe o endereço: ");
                    enderecos[idx - 1] = in.nextLine();
                    break;
                case 2:
                    System.out.println("Informe o índice:");
                    idx = Integer.parseInt(in.nextLine());
                    System.out.println("Nome: " + nomes[idx - 1]);
                    System.out.println("Idade: " + idades[idx - 1]);
                    System.out.println("Endereço: " + enderecos[idx - 1]);                   
                    break;
                case 3: 
                    System.out.println("Informe o nome: ");
                    nome = in.nextLine();
                    for (int i = 0; i < TAM; i++) {
                        if (nomes[i].equalsIgnoreCase(nome)) {
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Idade: " + idades[i]);
                            System.out.println("Endereço: " + enderecos[i]);                   
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void exibeMenu() {
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1. Cadastrar pessoa em índice");
        System.out.println("2. Mostrar pessoa em índice");
        System.out.println("3. Pesquisar pessoa por nome");
        System.out.println("0. Sair");
    }
}
