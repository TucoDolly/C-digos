/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploproduto;

import entidade.Produto;

/**
 *
 * @author aluno
 */
public class ExemploProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p = new Produto("TV", 2500, 10);
        Produto p2 = new Produto("Notebook", 4850.65, 5);
        Produto p3 = new Produto("Roteador", 500, 25);
        Produto p4 = new Produto("Notebook", 123);
                
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(" --------------------------");
        
        p.removeProduto(2);
        p2.removeProduto(1);
        p3.removeProduto(10);
        
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println(" --------------------------");
        p.adicionaProduto(3);
        p2.adicionaProduto(1);
        p3.adicionaProduto(4);
        
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        
        double media = (p.getPreco() + p2.getPreco() + p3.getPreco())/3;
        
        System.out.println("Media: " + media);
        
        System.out.println(p4);
        p4.setQuant(10);
        
        p4.setPreco(8500);
        
        System.out.println(p4);
        
                
    }
    
}
