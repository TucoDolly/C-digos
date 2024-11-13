/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaotemp;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ConversaoTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float tempC, tempF, tempK;
        
        System.out.println("Informe a temperatura em Cº:");
        tempC = ler.nextFloat();
        
        tempF = tempC * 1.8f + 32;
        tempK = tempC + 273.15f;
        
        System.out.println("Temperatura C: " + tempC);
        System.out.println("Temperatura F: " + tempF);
        System.out.println("Temperatura K: " + tempK);
        
    }
    
}
