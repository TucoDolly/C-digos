/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoestatico;

/**
 *
 * @author aluno
 */
public class Calculadora {
    public static final double PI = 3.14159;
    
    public static double volume(double raio){
        return 4f/3f * PI * (raio*raio*raio);
    }
    
    public static double circunferencia(double raio){
        return 2 * PI * raio;
    }
    
    public static double areaQuadrado(double lado){
        return lado*lado;
    }
    
    public static double perimetroQuadrado(double lado){
        return lado+lado+lado+lado;
    }
}
