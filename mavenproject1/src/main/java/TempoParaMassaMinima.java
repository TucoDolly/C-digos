import java.util.Scanner;

public class TempoParaMassaMinima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a massa inicial
        System.out.print("Digite a massa inicial do material (em gramas): ");
        double massaInicial = scanner.nextDouble();

        // Verificar se a massa inicial é válida
        if (massaInicial <= 0) {
            System.out.println("A massa inicial deve ser um valor positivo.");
            scanner.close();
            return;
        }

        // Definir a massa mínima
        double massaMinima = 0.05;

        // Definir o tempo de perda de metade da massa (em segundos)
        int tempoPerda = 50;

        // Inicializar variáveis para o cálculo
        double massaAtual = massaInicial;
        int tempoTotal = 0;

        // Loop para reduzir a massa até que seja menor que a massa mínima
        while (massaAtual >= massaMinima) {
            massaAtual /= 2;  // A massa perde metade a cada intervalo de tempo
            tempoTotal += tempoPerda;  // Adicionar o tempo correspondente
        }

        // Exibir o resultado
        System.out.println("O tempo necessário para que a massa se torne menor que " +
                           massaMinima + " gramas é: " + tempoTotal + " segundos.");

        // Fechar o scanner
        scanner.close();
    }
}

