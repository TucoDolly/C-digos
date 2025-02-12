
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Empresas {

    private Empresa[] empresas;

    public Empresa[] getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresa[] empresas) {
        this.empresas = empresas;
    }

    public Empresas() {
        this.empresas = new Empresa[4];
        Scanner input = new Scanner(System.in);

        String nome;
        int anoAbertura, totalFuncionarios;
        double faturamento;

        for (int i = 0; i < 4; i++) {
            System.out.println("--- Cadastro Empresa ---");
            System.out.println("Nome: ");
            nome = input.next();
            System.out.println("Ano de abertura: ");
            anoAbertura = input.nextInt();
            System.out.println("Total de funcionários: ");
            totalFuncionarios = input.nextInt();
            System.out.println("Faturamento: ");
            faturamento = input.nextDouble();

            this.empresas[i] = new Empresa(nome, anoAbertura, totalFuncionarios, faturamento);
        }
    }

    public void Mostrar() {
        Empresa atual;
        double impostos, impostosFuncionarios, lucro;
        System.out.println("--- Empresas ---");
        System.out.println();

        for (int i = 0; i < 4; i++) {
            atual = this.empresas[i];
            impostos = atual.TotalImpostosDevidos();
            impostosFuncionarios = atual.TotalImpostosComFuncionarios();
            lucro = atual.getFaturamento() - impostos - impostosFuncionarios;

            System.out.println("Nome: " + atual.getNome());
            System.out.println("Ano de abertura: " + atual.getAnoAbertura());
            System.out.println("Total de funcionários: " + atual.getTotalFuncionarios());
            System.out.println("Faturamento: " + atual.getFaturamento());
            System.out.println("Impostos: " + impostos);
            System.out.println("Impostos com funcionários: " + impostosFuncionarios);
            System.out.println("Lucro: " + lucro);
        }
    }

    public Empresa MaisJovem() {
        int indice = 0;
        int length = this.empresas.length;
        Empresa atual;

        for (int i = 1; i < length; i++) {
            atual = this.empresas[i];

            if (atual.getAnoAbertura() > this.empresas[indice].getAnoAbertura()) {
                indice = i;
            }
        }

        return this.empresas[indice];
    }

    public Empresa MaiorFaturamento() {
        int indice = 0;
        int length = this.empresas.length;
        Empresa atual;

        for (int i = 1; i < length; i++) {
            atual = this.empresas[i];

            if (atual.getFaturamento() > this.empresas[indice].getFaturamento()) {
                indice = i;
            }
        }

        return this.empresas[indice];
    }

    public Empresa MaisImpostos() {
        int indice = 0;
        int length = this.empresas.length;
        double totalImpostosAtual, totalImpostosMaior;
        Empresa atual;

        for (int i = 1; i < length; i++) {
            atual = this.empresas[i];
            totalImpostosAtual = atual.TotalImpostosComFuncionarios() + atual.TotalImpostosDevidos();
            totalImpostosMaior = this.empresas[indice].TotalImpostosComFuncionarios() + this.empresas[indice].TotalImpostosDevidos();

            if (totalImpostosAtual > totalImpostosMaior) {
                indice = i;
            }
        }

        return this.empresas[indice];
    }

    public double MediaFaturamentoLiquido() {
        int length = this.empresas.length;
        double impostos, impostosFuncionarios, faturamento, lucro;
        double totalLucro = 0;
        Empresa atual;

        for (int i = 0; i < length; i++) {
            atual = this.empresas[i];
            impostos = atual.TotalImpostosDevidos();
            impostosFuncionarios = atual.TotalImpostosComFuncionarios();
            faturamento = atual.getFaturamento();
            lucro = faturamento - impostos - impostosFuncionarios;
            totalLucro += lucro;
        }

        return totalLucro / length;
    }

    public Empresa MaiorQuantidadeFuncionarios() {
        int indice = 0;
        int length = this.empresas.length;
        Empresa atual;

        for (int i = 1; i < length; i++) {
            atual = this.empresas[i];

            if (atual.getTotalFuncionarios() > this.empresas[indice].getTotalFuncionarios()) {
                indice = i;
            }
        }

        return this.empresas[indice];
    }

    public Empresa MenorQuantidadeFuncionarios() {
        int indice = 0;
        int length = this.empresas.length;
        Empresa atual;

        for (int i = 1; i < length; i++) {
            atual = this.empresas[i];

            if (atual.getTotalFuncionarios() < this.empresas[indice].getTotalFuncionarios()) {
                indice = i;
            }
        }

        return this.empresas[indice];
    }
}
