import java.util.Scanner;

public class CalculaMDC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os dois números inteiros
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Garantir que ambos os números sejam positivos e não zero
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Os números devem ser inteiros positivos.");
            scanner.close();
            return;
        }

        // Aplicar o algoritmo de Euclides para encontrar o MDC
        int mdc = calcularMDC(num1, num2);

        // Exibir o resultado
        System.out.println("O Máximo Divisor Comum (MDC) entre " + num1 + " e " + num2 + " é: " + mdc);

        // Fechar o scanner
        scanner.close();
    }

    public static int calcularMDC(int a, int b) {
        // Enquanto b não for zero, continue a calcular o resto
        while (b != 0) {
            int resto = a % b; // Calcula o resto da divisão de a por b
            a = b; // Substitui a por b
            b = resto; // Substitui b pelo resto
        }
        // Quando b é zero, a é o MDC
        return a;
    }
}

