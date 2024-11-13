/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Fruta;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExemploConstrutores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        String auxTipo, auxNome;
        int auxQtde;
        
        System.out.print("Informe o nome: ");
        auxNome = lerTexto.nextLine();
        System.out.print("Informe o tipo: ");
        auxTipo = lerTexto.nextLine();
        System.out.print("Infome a quantidade: ");
        auxQtde = ler.nextInt();
        
        Fruta f1 = new Fruta(auxNome, auxTipo, auxQtde);
        
        System.out.print("Informe o nome: ");
        auxNome = lerTexto.nextLine();
        System.out.print("Informe o tipo: ");
        auxTipo = lerTexto.nextLine();
        System.out.print("Infome a quantidade: ");
        auxQtde = ler.nextInt();
        
        Fruta f2 = new Fruta(auxNome, auxTipo, auxQtde);
        
        System.out.println(f1);
        System.out.println(f2);
        
        f1.venda(3);
        
        f2.venda(5);
        
        System.out.println(f1);
        System.out.println(f2);
    }
    
}
