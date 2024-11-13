/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Aluno;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExemploAlunoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        String auxNome;
        float nota[] = new float[3];
               
        Aluno aluno2 = new Aluno();
                               
        System.out.print("Informe o nome do aluno 1: ");
        auxNome = lerTexto.nextLine();
        
        System.out.print("Informe a nota 1 do aluno 1: ");
        nota[0] = ler.nextFloat();
        
        System.out.print("Informe a nota 2 do aluno 1: ");
        nota[1] = ler.nextFloat();
        
        System.out.print("Informe a nota 3 do aluno 1: ");
        nota[2] = ler.nextFloat();
        
        Aluno aluno1 = new Aluno(auxNome, nota[0], nota[1], nota[2]);
        System.out.println(aluno1.toString());
        
        System.out.print("Informe o nome do aluno 2: ");
        aluno2.nome = lerTexto.nextLine();
        
        System.out.print("Informe a nota 1 do aluno 2: ");
        aluno2.notas[0] = ler.nextFloat();
        
        System.out.print("Informe a nota 2 do aluno 2: ");
        aluno2.notas[1] = ler.nextFloat();
        
        System.out.print("Informe a nota 3 do aluno 2: ");
        aluno2.notas[2] = ler.nextFloat();
        
        aluno1.calcularMedia();
        aluno2.calcularMedia();
        aluno1.statusAluno();
        aluno2.statusAluno();
        
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
    
}
