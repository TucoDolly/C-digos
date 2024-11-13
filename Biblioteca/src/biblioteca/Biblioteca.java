/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import entidade.Livro;
import entidade.auxiliar;

/**
 *
 * @author aluno
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l1 = new Livro("Don Casmurro", "Nao sei");
        Livro l2 = new Livro("Caça Fantasmas", "Desconhecido", 2010);
        Livro l3 = new Livro("Auto da compadecida", "Novo autor", 1996);
        Livro l4 = new Livro("POO na pratica", "Russel", 2005);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
        l1.emprestar();
        l3.emprestar();
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
        l1.devolver();
        
        System.out.println(l1);
        //System.out.println(l1.consulta);
        
        System.out.println(l2.consultaIdade());
        System.out.println(l4.consultaIdade());
        
        auxiliar aux = new auxiliar();
        System.out.println(aux.mostrar());
    }
    
}
