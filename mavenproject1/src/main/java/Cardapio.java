
import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        int codigo;
        double qtd, total, v1 = 0, v2 = 0, v3 = 0, v4 = 0, v5 = 0;
        Scanner input = new Scanner(System.in);

        // Loop para continuar lendo até que o usuário escolha sair (codigo 0)
        do {
            // Ler código e quantidade
            System.out.println("Digite o código (ou 0 para sair): ");
            codigo = input.nextInt();
            
            if (codigo == 0) {
                break; // Sai do loop se o código for 0
            }

            System.out.println("Digite a quantidade: ");
            qtd = input.nextDouble(); // Permite valores decimais para quantidade

            // Processar o código do menu
            switch (codigo) {
                case 100:
                    v1 += qtd * 1.10; // Adiciona ao total de v1
                    break;
                case 101:
                    v2 += qtd * 1.30; // Adiciona ao total de v2
                    break;
                case 102:
                    v3 += qtd * 1.50; // Adiciona ao total de v3
                    break;
                case 103:
                    v4 += qtd * 1.60; // Adiciona ao total de v4
                    break;
                case 104:
                    v5 += qtd * 1.20; // Adiciona ao total de v5
                    break;
                default:
                    // Mensagem de código inválido e continua o loop
                    System.out.println("Código inválido, tente novamente.");
                    break; // Continua o loop sem sair
            }

        } while (true); // O loop continua até que o usuário escolha sair com o código 0

        // Calcula e exibe o total
        total = v1 + v2 + v3 + v4 + v5;
        System.out.println("O total é: " + total);

        // Fechar o scanner
        input.close();
    }
}
