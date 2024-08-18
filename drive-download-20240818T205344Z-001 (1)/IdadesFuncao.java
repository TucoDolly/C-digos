package edu.ifsc.testes;

import java.util.Scanner;

/*
  Implemente um programa em Java que lê a idade de 5 pessoas e 
  escreva quantas delas possuem idade igual ou superior a 18 anos. 
  O programa deve verificar se a idade é válida, ou seja, entre 1 a 130 anos. 
*/
public class IdadesFuncao {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int maiores = 0;
        maiores = maiores + verificaIdade(in);
        maiores = maiores + verificaIdade(in);
        maiores = maiores + verificaIdade(in);
        maiores = maiores + verificaIdade(in);
        maiores = maiores + verificaIdade(in);
        System.out.println("Maiores de idade: " + maiores);
    }
    
    public static int verificaIdade(Scanner in) {
        int idade;
        int idadeOk = 1;
        
        System.out.println("Informe a idade: ");
        idade = in.nextInt();
        if (!(idade >= 1 && idade <= 130)) {
            System.out.println("Idade inválida!");
            idadeOk = 0;
        }
        if (idade < 18) {
            idadeOk = 0;
        }
        return idadeOk;
    } 
    
    
}
