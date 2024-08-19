import java.util.Scanner;

public class EstatisticasNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar variáveis para armazenar as estatísticas
        double soma = 0.0;
        int quantidade = 0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        System.out.println("Digite números reais (digite 0 para encerrar):");

        while (true) {
            // Ler um número real
            double numero = scanner.nextDouble();

            // Verificar se o número é 0 para encerrar
            if (numero == 0) {
                break;
            }

            // Atualizar soma e quantidade
            soma += numero;
            quantidade++;

            // Atualizar maior e menor valor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Verificar se algum valor foi digitado
        if (quantidade > 0) {
            // Calcular a média
            double media = soma / quantidade;

            // Exibir os resultados
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Quantidade de valores: " + quantidade);
            System.out.println("Valor médio: " + media);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor foi digitado.");
        }

        // Fechar o scanner
        scanner.close();
    }
}

