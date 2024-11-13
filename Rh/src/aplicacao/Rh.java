/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Empregado;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Rh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado funcionario = new Empregado();
        final int quant = 10;
        
        Scanner lerTexto = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o nome do funcionário: ");
        funcionario.nome = lerTexto.nextLine();
        
        System.out.println("Informe o salario bruto: ");
        funcionario.salarioBruto = ler.nextDouble();
        
        System.out.println("Informe o valor dos impostos: ");
        funcionario.impostos = ler.nextDouble();
        
        System.out.println(funcionario);
        
        funcionario.aumentarSalario(15);
        
        System.out.println(funcionario);
    }
    
}
