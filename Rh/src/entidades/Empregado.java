/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Fernando
 * Essa classe gerencia os dados do funcionario 
 * Possui métodos para calcular o salario liquido e reajustar o salário
 */
public class Empregado {
    /**
   Essa classe gerencia os dados do funcionario 
  Possui métodos para calcular o salario liquido e reajustar o salário
 */
    public String nome;
    public double salarioBruto;
    public double impostos;
    
    public double salarioLiquido(){
        return salarioBruto - impostos;
    }
    
    public void aumentarSalario(double percentual){
        double auxPercentual;
        auxPercentual = percentual/100 + 1;
        salarioBruto = salarioBruto * auxPercentual;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Salario Bruto: " + salarioBruto 
                + " Impostos: " + impostos + " Salario Liquido: "+
                salarioLiquido();
    }
    
}
