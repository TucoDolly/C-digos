public class TabuadaAninhada {

    public static void main(String[] args) {
        // Iterar sobre os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            
            // Iterar novamente sobre os números de 1 a 10 para cada número
            for (int j = 1; j <= 10; j++) {
                // Calcular e exibir o resultado da multiplicação
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            
            // Adicionar uma linha em branco para separar as tabuadas
            System.out.println();
        }
    }
}
