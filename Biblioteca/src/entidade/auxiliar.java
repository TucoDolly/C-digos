/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author aluno
 */
public class auxiliar {
     Livro l;
   
     public auxiliar(){
         l = new Livro("AAA", "BBB");
     }
     
     public String mostrar(){
         return l.consultaStatus();
     }
    
}
