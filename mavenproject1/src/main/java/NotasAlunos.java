import java.util.Scanner;

public class NotasAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número de alunos
        System.out.print("Digite o número de alunos: ");
        int numeroDeAlunos = scanner.nextInt();

        // Inicializar variáveis para o cálculo das médias e contagens
        double somaTotalDasNotas = 0.0;
        int totalAprovados = 0;
        int totalEmExame = 0;
        int totalReprovados = 0;

        // Processar cada aluno
        for (int i = 1; i <= numeroDeAlunos; i++) {
            System.out.println("Aluno " + i + ":");

            // Ler as duas notas do aluno
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            // Calcular a média do aluno
            double media = (nota1 + nota2) / 2;
            somaTotalDasNotas += media;

            // Determinar a situação do aluno
            if (media < 3) {
                System.out.println("Média do aluno: " + media + " - Reprovado");
                totalReprovados++;
            } else if (media >= 3 && media < 7) {
                System.out.println("Média do aluno: " + media + " - Em exame");
                totalEmExame++;
            } else {
                System.out.println("Média do aluno: " + media + " - Aprovado");
                totalAprovados++;
            }
        }

        // Calcular a média total da turma
        double mediaTotalDaTurma = somaTotalDasNotas / numeroDeAlunos;

        // Exibir resultados finais
        System.out.println("\nNota média total da turma: " + mediaTotalDaTurma);
        System.out.println("Número total de alunos aprovados: " + totalAprovados);
        System.out.println("Número total de alunos em exame: " + totalEmExame);
        System.out.println("Número total de alunos reprovados: " + totalReprovados);

        // Fechar o scanner
        scanner.close();
    }
}
