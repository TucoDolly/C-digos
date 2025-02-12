/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        Empresas empresas = new Empresas();
        int length = empresas.getEmpresas().length;
        int idade;
        Empresa atual;

        empresas.Mostrar();

        System.out.println();
        for (int i = 0; i < length; i++) {
            atual = empresas.getEmpresas()[i];
            idade = 2024 - atual.getAnoAbertura();
            System.out.println(atual.getNome() + " - Idade: " + idade);
        }

        System.out.println();
        atual = empresas.MaisJovem();
        System.out.println("Empresa mais nova: " + atual.toString());

        System.out.println();
        atual = empresas.MaiorFaturamento();
        System.out.println("Empresa com maior faturamento: " + atual.toString());

        System.out.println();
        atual = empresas.MaisImpostos();
        System.out.println("Empresa com maior gasto em impostos: " + atual.toString());

        System.out.println();
        System.out.println("Média do faturamento líquido das empresas: " + empresas.MediaFaturamentoLiquido());

        System.out.println();
        atual = empresas.MaiorQuantidadeFuncionarios();
        System.out.println("Empresa com maior nº de funcionários: " + atual.toString());
        
        System.out.println();
        atual = empresas.MenorQuantidadeFuncionarios();
        System.out.println("Empresa com menor nº de funcionários: " + atual.toString());
    }
}
