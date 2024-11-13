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
public class Triangulo {
    public float a;
    public float b;
    public float c;
    //public float p;
    public float area;
    public float perimetro;
    public String nome;
    
    public void definirLados(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o lado A: ");
        a = ler.nextFloat();
        System.out.print("Informe o lado B: ");
        b = ler.nextFloat();
        System.out.print("Informe o lado C: ");
        c = ler.nextFloat();
    }
    
    /*public void calcularP(){
        p = (a+b+c)/2;
    }*/
    
    public void calcularArea(){
        //calcularP();
        float p = (a+b+c)/2;
        area = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public void mostraDados(){
        System.out.println("O valor do lado A: " + a);
        System.out.println("O valor do lado B: " + b);
        System.out.println("O valor do lado C: " + c);
        System.out.println("O valor de Perimetro: " + perimetro);
        System.out.println("O valor da area: " + area);
    }

    public void calcularPerimetro(){
        perimetro = a+b+c;
    }
    
}
