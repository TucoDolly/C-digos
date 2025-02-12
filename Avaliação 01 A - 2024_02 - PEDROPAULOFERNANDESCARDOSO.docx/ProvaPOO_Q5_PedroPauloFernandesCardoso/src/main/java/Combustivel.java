/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Combustivel {

    private String nome;
    private double quantidade;
    private double precoUnitario;
    private double percentualImpostos;
    private double descontoMaximo;
    private double quantidadeMinimaParaDesconto;

    public Combustivel(String nome, double quantidade, double precoUnitario, double percentualImpostos, double descontoMaximo, double quantidadeMinimaParaDesconto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.percentualImpostos = percentualImpostos;
        this.descontoMaximo = descontoMaximo;
        this.quantidadeMinimaParaDesconto = quantidadeMinimaParaDesconto;
    }
    
    public void Inicializa(String nome, double quantidade, double precoUnitario, double percentualImpostos, double descontoMaximo, double quantidadeMinimaParaDesconto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.percentualImpostos = percentualImpostos;
        this.descontoMaximo = descontoMaximo;
        this.quantidadeMinimaParaDesconto = quantidadeMinimaParaDesconto;
    }
    
    public double MostraPrecoVenda() {
        double valor = this.precoUnitario + this.precoUnitario * this.percentualImpostos;
        return valor;
    }
    
    public void Venda() {
        if (this.quantidade >= 1) {
            this.quantidade -= 1;
        }
    }
    
    public void Venda(double quantidadeVenda) {
        if (this.quantidade >= quantidadeVenda) {
            this.quantidade -= quantidadeVenda;
        }
    }
    
    public double RecebeMercadoria(double quantidadeRecebida) {
        double diferenca = this.quantidade + quantidadeRecebida - 1500;
        if (diferenca > 0) {
            System.out.println("Quantidade a ser devolvida: " + diferenca);
            this.quantidade = 1500;
            return diferenca;
        } else {
            this.quantidade += quantidadeRecebida;
            return 0;
        }
    }
    
    public void Mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Estouque: " + this.quantidade);
        System.out.println("Preço unitário: " + this.precoUnitario);
        System.out.println("Percentual impostos: " + this.percentualImpostos);
        System.out.println("Desconto máximo: " + this.descontoMaximo);
        System.out.println("Quantidade mínima para desconto: " + this.quantidadeMinimaParaDesconto);
        System.out.println("Preço de venda: " + this.MostraPrecoVenda());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPercentualImpostos() {
        return percentualImpostos;
    }

    public void setPercentualImpostos(double percentualImpostos) {
        this.percentualImpostos = percentualImpostos;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public double getQuantidadeMinimaParaDesconto() {
        return quantidadeMinimaParaDesconto;
    }

    public void setQuantidadeMinimaParaDesconto(double quantidadeMinimaParaDesconto) {
        this.quantidadeMinimaParaDesconto = quantidadeMinimaParaDesconto;
    }

    
}
