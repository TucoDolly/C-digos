/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moeda;

/**
 *
 * @author aluno
 */
public class Calculadora {
    public static double converteMoeda(double valor, double cotacao){
        return valor * cotacao * 1.06;
    } 
    
}
