
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
public class Combustiveis {

    private Combustivel[] combustiveis;

    public Combustivel[] getCombustiveis() {
        return combustiveis;
    }

    public void setCombustiveis(Combustivel[] combustiveis) {
        this.combustiveis = combustiveis;
    }

    public Combustiveis() {
        this.combustiveis = new Combustivel[5];
        Scanner input = new Scanner(System.in);

        String nome;
        double estoque = 0, precoLitro = 0, percentualImpostos = 0, descontoMaximo = 0, quantidadeMinimaDesconto = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("--- Cadastro Combustível ---");
            System.out.println("Nome: ");
            nome = input.next();
            System.out.println("Quantidade de litros em estoque: ");
            estoque = input.nextDouble();
            System.out.println("Preço por litro ");
            precoLitro = input.nextDouble();
            System.out.println("Percentual de impostos: ");
            percentualImpostos = input.nextDouble();
            System.out.println("Desconto máximo: ");
            descontoMaximo = input.nextDouble();
            System.out.println("Quantidade mínima para desconto: ");
            quantidadeMinimaDesconto = input.nextDouble();

            this.combustiveis[i] = new Combustivel(nome, estoque, precoLitro, percentualImpostos, descontoMaximo, quantidadeMinimaDesconto);
        }
    }

    public static double Venda(Combustivel combustivel, double quantidade, double percentualDesconto) {
        double quantidadeAtual = combustivel.getQuantidade();
        if (quantidade > quantidadeAtual) {
            System.out.println("O estoque é menor que a quantidade da venda.");
            return -1;
        }

        double valorTotal = quantidade * combustivel.getPrecoUnitario();
        if (combustivel.getQuantidadeMinimaParaDesconto() <= quantidade) {
            double desconto = valorTotal * percentualDesconto;

            if (desconto >= combustivel.getDescontoMaximo()) {
                valorTotal -= combustivel.getDescontoMaximo();
            } else {
                valorTotal -= desconto;
            }
        }
        valorTotal += valorTotal * combustivel.getPercentualImpostos();

        combustivel.setQuantidade(quantidadeAtual - quantidade);

        return valorTotal;
    }

    public void SituacaoEstoque() {
        Combustivel atual;
        String nome;
        double quantidade;
        double total;
        double totalComImpostos;
        int length = this.combustiveis.length;

        System.out.println("--- Situação Estoque ---");
        System.out.println();

        for (int i = 0; i < length; i++) {
            atual = this.combustiveis[i];
            nome = atual.getNome();
            quantidade = atual.getQuantidade();
            total = quantidade * atual.getPrecoUnitario();
            totalComImpostos = total + total * atual.getPercentualImpostos();

            System.out.println(nome);
            System.out.println("Estoque: " + quantidade);
            System.out.println("Subtotal: " + total);
            System.out.println("Subtotal + impostos: " + totalComImpostos);

            System.out.println();
        }
    }
}
