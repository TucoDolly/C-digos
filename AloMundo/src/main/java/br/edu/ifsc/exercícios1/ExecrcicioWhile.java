
package br.edu.ifsc.exercícios1;
import java.util.Scanner;

public class ExecrcicioWhile {

    
    public static void main(String[] args) {
        int numInicial;
        int numFinal;
        int x = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva o número inicial: ");
        numInicial = input.nextInt();
        System.out.println("Escreva o número final: ");
        numFinal = input.nextInt();
        System.out.println("");
        
        while(numInicial<=numFinal){
            System.out.println(numInicial);
            numInicial++;
        }
        
    }
    
}

