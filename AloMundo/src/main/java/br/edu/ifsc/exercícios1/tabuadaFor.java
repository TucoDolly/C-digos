
package br.edu.ifsc.exercícios1;

import java.util.Scanner;
public class tabuadaFor {

    
    public static void main(String[] args) {
        int numero;
        int multiplicador = 0;
        int total = 0;        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = input.nextInt();
        
        for(int x = 0; x <= 10; x++) {
            total = numero * ++multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + total);
        }
    }
    
}
