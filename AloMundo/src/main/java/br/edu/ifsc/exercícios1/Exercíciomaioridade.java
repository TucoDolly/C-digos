package br.edu.ifsc.exercícios1;

import java.util.Scanner;

   public class Exercíciomaioridade {
    public static void main(String[] args) {
        int idade;
      
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt()
        if(idade > 18){
            System.out.println("Você é de maior!");
            
        }else{
            System.out.println("Você não é de maior.");
        }            
                
    }
    
}
