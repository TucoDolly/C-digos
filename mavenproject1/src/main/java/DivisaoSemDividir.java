
import java.util.Scanner;


public class DivisaoSemDividir {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ler os dois números inteiros positivos
        System.out.print("Digite o primeiro número (Num1): ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número (Num2): ");
        int num2 = input.nextInt();

        // Garantir que os números são positivos e que Num2 não é zero
        if (num1 < 0 || num2 <= 0) {
            System.out.println("Os números devem ser positivos e o divisor não pode ser zero.");
            return;
        }

        // Inicializar o quociente e o resto
        int quociente = 0;
        int resto = num1;

        // Calcular o quociente e o resto
        while (resto >= num2) {
            resto = resto - num2;
            quociente = quociente + 1;
        }

        // Exibir o resultado
        System.out.println("Quociente (Q): " + quociente);
        System.out.println("Resto (R): " + resto);

        // Fechar o scanner
       
    }
}
   

