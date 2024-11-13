/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.time.Year; 

/**
 *
 * @author aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;
    
    public Livro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = 1900;
        this.emprestado = false;
    }
    
    public Livro (String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }
    
    public void emprestar(){
        this.emprestado = true;
    }
    
    public void devolver(){
        this.emprestado = false;
    }
    
    protected String consultaStatus(){
        if(this.emprestado)
            return "EMPRESTADO";
        else
            return "DISPONIVEL";
    }
    
    public int consultaIdade(){
        int ano = Year.now().getValue();
        return ano - this.ano;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " Ano: " +
                ano + " Status: " + consultaStatus();
    }
    
}
