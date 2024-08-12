package br.edu.ifsc.exercícios1;

import java.util.Scanner;
public class Exercíciolatão {
    public static void main(String[] args) {
        int latao;
        double cobre, zinco;
         
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o peso do latão em ml: ");
       latao = entrada.nextInt();
       cobre = latao * 0.7;
       zinco = latao * 0.3;
       System.out.println("O peso do cobre vai ser: " + cobre + "E o peso do zinco será " + zinco);
       if(latao > 0){
           System.out.println("Valor Positivo!");
           
        } else {
           System.out.println("Valor nulo ou negativo!");
       }
    
    
    }
    
}
