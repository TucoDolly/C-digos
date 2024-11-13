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
public class Produto {
    private String nome;
    private double preco;
    private int quant;
    
    public Produto(){
        
    }
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quant = 0;
    } 
    
    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getQuant(){
        return this.quant;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setQuant(int quant){
        this.quant = quant;
    }
    
    public double valorTotalEstoque(){
        return preco*quant;
    }
    
    public void adicionaProduto(int quant){
        this.quant += quant;
    }
    
    public void removeProduto(int quant){
        this.quant -= quant;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Preco: " + preco + " Quant.: " +
                quant + " Valor Total: " + valorTotalEstoque();
    }
     
}
