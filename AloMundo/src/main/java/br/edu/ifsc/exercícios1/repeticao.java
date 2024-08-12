
package br.edu.ifsc.exercícios1;


public class repeticao {

    
    
    public static void main(String[] args) {
        int a, x = 10;
       for (a = 0; a <= x; a++) {
            System.out.println("O valor de a é: " + a);
            x = x * a;
        }
        System.out.println("Valor final de a: " + a);
    }
    
    
}
