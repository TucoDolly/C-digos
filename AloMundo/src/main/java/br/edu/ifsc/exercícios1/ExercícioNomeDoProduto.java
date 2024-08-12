package br.edu.ifsc.exercícios1;

import java.util.Scanner;

public class ExercícioNomeDoProduto {
    public static void main(String[] args) {
     int codigo;  
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o código do produto: ");
       codigo = entrada.nextInt();
       switch (codigo) {
            case 1:
                System.out.println("Parafuso");      
                
                break;
            case 2:
                System.out.println("Porca");
                break;
            case 3:
                System.out.println("Prego");
                break;
            case 4:
                System.out.println("Martelo");
                break;
            case 5:
                System.out.println("Tomada");
                break;
            
            
            
            
            default:
                System.out.println("Código não encontrado.");
                break;
        }
    }
    
    
}
