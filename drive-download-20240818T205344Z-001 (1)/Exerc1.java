package br.edu.ifsc.iprrepeticao;

import static br.edu.ifsc.iprrepeticao.util.Util.lerInt;
import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        int vi, vf;
        System.out.println("Informe o valor inicial: ");
        vi = lerInt();
        System.out.println("Informe o valor final: ");
        vf = lerInt();
        for (int i = vi; i <= vf; i++) {
            System.out.println(i);
        }
    }
    
}
