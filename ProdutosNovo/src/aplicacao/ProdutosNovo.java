/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidade.Produto;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ProdutosNovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String auxNome, auxTipo;
        int auxQuant;
        
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        System.out.print("Informe o nome do produto: ");
        auxNome = lerTexto.nextLine();
        
        System.out.print("Informe o tipo: ");
        auxTipo = lerTexto.nextLine();
        
        System.out.print("Informe a quantidade: ");
        auxQuant = ler.nextInt();
        
        Produto p = new Produto(auxNome, auxTipo, auxQuant);
        
        System.out.println(p.toString());
        
        p.venda(5);
        
        System.out.println(p.toString());
        
    }
    
}
