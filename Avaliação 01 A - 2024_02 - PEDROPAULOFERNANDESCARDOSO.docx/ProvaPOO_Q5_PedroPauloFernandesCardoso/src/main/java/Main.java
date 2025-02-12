


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Combustiveis combustiveis = new Combustiveis();
        Combustivel atual;
        double length = combustiveis.getCombustiveis().length;
        System.out.println(length);
        
        for (int i = 0; i < length; i++) {
            atual = combustiveis.getCombustiveis()[i];
            atual.Mostrar();
            
            combustiveis.Venda(atual, 20 + i, 5 + i);
            
            atual.RecebeMercadoria(500*i);
            atual.Venda();
            atual.Venda(20*i);
            
            atual.Mostrar();
            System.out.println();
        }
        
        combustiveis.SituacaoEstoque();
    }
   
}
