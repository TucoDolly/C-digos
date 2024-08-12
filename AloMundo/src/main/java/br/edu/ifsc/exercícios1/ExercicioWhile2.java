
package br.edu.ifsc.exercícios1;


public class ExercicioWhile2 {

    
    public static void main(String[] args) {
        double alturaze = 1.10;
            double alturachico = 1.50;
            double tempo = 0;

            while (alturaze <= alturachico){
            
                alturachico += 0.02;
                alturaze += 0.03;
                tempo ++;
            }
            System.out.println("Anos: " + tempo + "Ze: " + alturaze + " Chico: " + alturachico );
    }
}
