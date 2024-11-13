/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author aluno
 */
public class Fruta {
    public String tipo;
    public String nome;
    public int quantidade;
    
    public Fruta(String nome, String tipo, int quantidade){
        this.tipo = tipo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Tipo: " + tipo + "Quant.: " + 
                quantidade;
    }
    
    public void venda(int qtdeVendida){
        quantidade -= qtdeVendida;
        System.out.println("O saldo restante é: " + quantidade);
    }
   
}
