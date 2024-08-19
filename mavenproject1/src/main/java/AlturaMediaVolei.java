import java.util.Scanner;

public class AlturaMediaVolei {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número de jogadores
        System.out.print("Digite o número de jogadores do time: ");
        int numeroDeJogadores = scanner.nextInt();

        // Validar o número de jogadores
        if (numeroDeJogadores <= 0) {
            System.out.println("O número de jogadores deve ser maior que zero.");
            scanner.close();
            return;
        }

        // Inicializar variáveis para acumular a soma das alturas
        double somaDasAlturas = 0.0;

        // Ler a altura de cada jogador e somar
        for (int i = 1; i <= numeroDeJogadores; i++) {
            System.out.print("Digite a altura do jogador " + i + " (em metros): ");
            double altura = scanner.nextDouble();
            somaDasAlturas += altura;
        }

        // Calcular a altura média
        double alturaMedia = somaDasAlturas / numeroDeJogadores;

        // Exibir a altura média
        System.out.println("A altura média do time é: " + alturaMedia + " metros.");

        // Fechar o scanner
        scanner.close();
    }
}


