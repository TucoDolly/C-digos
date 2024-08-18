package br.edu.ifsc.ipr;

import java.util.Scanner;

public class VetorEx1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[6] = 99;
        numeros[9] = 0;
        numeros[2] = 4;
        numeros[5] = 123;
        numeros[4] = numeros[2];
        numeros[3] = 4;
        numeros[8] = 11;
        numeros[7] = numeros[6];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);            
        }
    }
}
