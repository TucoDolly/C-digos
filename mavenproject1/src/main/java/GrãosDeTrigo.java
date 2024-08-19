public class GrãosDeTrigo {

    public static void main(String[] args) {
        // Número de casas no tabuleiro de xadrez
        int numeroDeCasas = 64;

        // Variável para armazenar o total de grãos
        long totalGraos = 0;

        // Variável para armazenar o número de grãos em cada casa
        long graosNaCasaAtual = 1;

        // Calcular o total de grãos em cada casa do tabuleiro
        for (int i = 1; i <= numeroDeCasas; i++) {
            totalGraos += graosNaCasaAtual;
            graosNaCasaAtual *= 2; // Dobrar o número de grãos para a próxima casa
        }

        // Exibir o total de grãos
        System.out.println("O total de grãos de trigo no tabuleiro é: " + totalGraos);
    }
}
