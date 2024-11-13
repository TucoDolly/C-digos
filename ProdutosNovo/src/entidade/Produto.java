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
    public String nome;
    public String tipo;
    public int quantidade;

    public Produto(String nome, String tipo, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public void venda(int quant){
        if(quant > quantidade)
            System.out.println("Não há estoque!");
        else{
            quantidade -= quant;
            System.out.println("Saldo atualizado: " + quantidade);
        }
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + " Tipo: " + tipo + " Quantidade: " + quantidade;
    }
    
}
