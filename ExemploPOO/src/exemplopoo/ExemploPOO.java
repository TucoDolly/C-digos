/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopoo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExemploPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*float a1, b1, c1, a2, b2, c2;
        float p1, p2;
        float area1, area2;*/
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();
        
        System.out.println("Informe os lados do triangulo A: ");
        x.definirLados();
        System.out.println("Informe os lados do triangulo B: ");
        y.definirLados();
                
        x.calcularArea();
        y.calcularArea();
        
        x.calcularPerimetro();
        y.calcularPerimetro();
        
        x.mostraDados();
        y.mostraDados();
        
        if(x.area > y.area)
            System.out.println("A area de X é maior");
        else
            System.out.println("A area de Y é maior");
        //Scanner ler = new Scanner(System.in);
        
        /*System.out.println("Informe o valor de A do triangulo 1");
        a1 = ler.nextFloat();
        System.out.println("Informe o valor de B do triangulo 1");
        b1 = ler.nextFloat();
        System.out.println("Informe o valor de C do triangulo 1");
        c1 = ler.nextFloat();*/
        
        /*System.out.println("Informe o valor de A do triangulo 2");
        y.a = ler.nextFloat();
        System.out.println("Informe o valor de B do triangulo 2");
        y.b = ler.nextFloat();
        System.out.println("Informe o valor de C do triangulo 2");
        y.c = ler.nextFloat();*/
        
        /*p1 = (a1+b1+c1)/2;
        area1 = (float) Math.sqrt((p1*(p1-a1)*(p1-b1)*(p1-c1)));
        
        p2 = (a2+b2+c2)/2;
        area2 = (float) Math.sqrt((p2*(p2-a2)*(p2-b2)*(p2-c2)));*/
        
        /*System.out.println("Valor de P = " + p1);
        System.out.println("Area do tringulo A = " + area1);
        
        System.out.println("Valor de P = " + p2);
        System.out.println("Area do tringulo B = " + area2);*/
    }
    
}
