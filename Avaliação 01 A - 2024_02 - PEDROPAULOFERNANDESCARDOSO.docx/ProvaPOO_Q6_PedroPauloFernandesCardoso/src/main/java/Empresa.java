/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Empresa {

    private String nome;
    private int anoAbertura;
    private int totalFuncionarios;
    private double faturamento;

    public Empresa(String nome, int anoAbertura, int totalFuncionarios, double faturamento) {
        this.nome = nome;
        this.anoAbertura = anoAbertura;
        this.totalFuncionarios = totalFuncionarios;
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoAbertura() {
        return anoAbertura;
    }

    public void setAnoAbertura(int anoAbertura) {
        this.anoAbertura = anoAbertura;
    }

    public int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(int totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", anoAbertura=" + anoAbertura + ", totalFuncionarios=" + totalFuncionarios + ", faturamento=" + faturamento + '}';
    }

    public double TotalImpostosDevidos() {
        double aliquota;
        
        if (this.faturamento <= 500000) {
            aliquota = 0.07;
        } else if (this.faturamento <= 1000000) {
            aliquota = 0.09;
        } else {
            aliquota = 0.12;
        }
        
        return this.faturamento * aliquota;
    }
    
    public double TotalImpostosComFuncionarios() {
        double aliquota;
        int qnt = this.totalFuncionarios;
        
        if (qnt <= 3) {
            aliquota = 0.045;
        } else if (qnt <= 8) {
            aliquota = 0.085;
        } else if (qnt <= 12) {
            aliquota = 0.1075;
        } else if (qnt <= 18) {
            aliquota = 0.1343;
        } else {
            aliquota = 0.1734;
        } 
        
        return this.faturamento * aliquota;
    }
}
