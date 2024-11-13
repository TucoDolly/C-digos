/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinicial;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExemploInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "Programação Orientada a Objetos";
        Scanner lertexto = new Scanner(System.in);
        Scanner lerValor = new Scanner(System.in);
        
        int a = 78, b = 43;
        float c = 3.45f, d = 8.99f;
        float result1, result2, result3, result4;
        
        System.out.println("Informe um texto");
        texto = lertexto.nextLine();
        
        System.out.println("Informe o valor A:");
        a = lerValor.nextInt();
        
        System.out.println("Informe o valor B:");
        b = lerValor.nextInt();
        
        System.out.println("Informe o valor C:");
        c = lerValor.nextFloat();
        
        System.out.println("Informe o valor D:");
        d = lerValor.nextFloat(); 
        
        System.out.println("Texto: " + texto);
        System.out.println("a: " + a + " b: " + b);
        System.out.println("c: " + c + " d: " + d);
        
        //result1 = (a*b)/a;
        result1 = (multiplica(a,b))/a;
        //result2 = ((c*c)*d)-c;
        result2 = (multiplica(multiplica(c,c),d))-c;
        result3 = d/c;
        //result4 = b-2*a;
        result4 = b-multiplica(2,a);
        
        System.out.println("(a*b)/a = " + result1);
        System.out.println("((c*c)*d)-c = " + result2);
        System.out.println("d/c = " + result3);
        System.out.println("b-2*a = " + result4);
        
    }
    
    public static float multiplica(float a, float b){
        return a*b;
    }
    
}
