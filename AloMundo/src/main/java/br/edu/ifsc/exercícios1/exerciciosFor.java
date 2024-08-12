
package br.edu.ifsc.exercícios1;

import java.util.Scanner;

public class exerciciosFor {

    
    public static void main(String[] args) {
        int numInicial = 0;
        int numFinal = 0;
        int numEntre = 0;
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o numéro inicial: ");
                numInicial = input.nextInt();
                System.out.println("Digite o número final: ");
                numFinal = input.nextInt();
                numEntre = numInicial;
                
                System.out.println("Os números entre " + numEntre + " e " + numFinal + " são: \n");
                while(numInicial <= numFinal){
                    System.out.println(numInicial);
                    numInicial++;
                }
        
    }
    
}
