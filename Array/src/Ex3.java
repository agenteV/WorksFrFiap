import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Cria um array para armazenar as médias dos 10 alunos
        double[] medias = new double[3];

        // Inicializa o contador de alunos com média maior ou igual a 6.0
        int alunosAprovados = 0;

        // Loop principal para iterar sobre os 10 alunos
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Aluno " + (i + 1) + " ---");

            double somaNotas = 0;
            // Loop para pedir as 4 notas
            for (int j = 0; j < 3; j++) {
                // Bloco try-catch para garantir que a entrada é um número
                try {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    somaNotas += scanner.nextDouble();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    // Limpa o buffer do scanner para evitar loop infinito
                    scanner.next();
                    j--; // Decrementa j para repetir a entrada da nota atual
                }
            }

            // Calcula a média do aluno
            double mediaAluno = somaNotas / 3;

            // Armazena a média no array
            medias[i] = mediaAluno;

            // Verifica se a média é maior ou igual a 6.0 e incrementa o contador
            if (mediaAluno >= 6.0) {
                alunosAprovados++;
            }
        }

        // Exibe as médias de todos os alunos
        System.out.println("\n--- Resultados ---");
        System.out.print("Médias dos 10 alunos: [");
        for (int i = 0; i < medias.length; i++) {
            System.out.print(String.format("%.2f", medias[i]));
            if (i < medias.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Exibe o número total de alunos com média maior ou igual a 6.0
        System.out.println("O número de alunos com média maior ou igual a 6.0 é: " + alunosAprovados);

        // Fecha o objeto Scanner
        scanner.close();
    }
}