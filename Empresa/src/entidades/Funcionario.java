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
public class Funcionario {
    private String nome;
    private String sexo;
    private String cargo;
    private float salarioBase;
    private float horasExtras;
    private int numeroFilhos;
    
    public Funcionario(String nome, String sexo, String 
            cargo, float salarioBase, float horasExtras,
            int numeroFilhos){
        this.nome = nome;
        this.cargo = cargo;
        this.sexo = sexo;
        this.horasExtras = horasExtras;
        this.numeroFilhos = numeroFilhos;
        this.salarioBase = salarioBase;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public int getNumeroFilhos(){
        return this.numeroFilhos;
    }
    
    public float getHorasExtras(){
        return this.horasExtras;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float calculaSalario(){
        return salarioBase + ((salarioBase / 220f) * 1.2f *
                horasExtras) + (numeroFilhos * 18.5f);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Sexo: " + this.sexo
                + " Cargo: " + this.cargo + " H.Extras: " +
                this.horasExtras + " N.Filhos: " + this.numeroFilhos
                + " Salario: " + calculaSalario();
    }
    
    
}
