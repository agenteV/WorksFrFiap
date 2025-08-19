import java.util.Scanner;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // 1. Lê e armazena os 10 números inteiros no vetor
        System.out.println("Digite 10 números inteiros para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            // Loop para garantir que a entrada é um número inteiro
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
                    break; // Sai do loop interno se a entrada for válida
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    scanner.next(); // Limpa o buffer do scanner
                }
            }
        }

        // 2. Imprime o vetor original
        System.out.println("\nArray original: " + Arrays.toString(vetor));

        // 3. Inverte os elementos do vetor
        // Usa dois ponteiros: um no início e um no final do array
        int inicio = 0;
        int fim = vetor.length - 1;

        // Continua o loop até que os ponteiros se cruzem ou se encontrem
        while (inicio < fim) {
            // Troca os elementos das posições 'inicio' e 'fim'
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            // Move os ponteiros para o centro
            inicio++;
            fim--;
        }

        // 4. Imprime o vetor invertido
        System.out.println("Array invertido: " + Arrays.toString(vetor));

        // Fecha o objeto Scanner
        scanner.close();
    }
}
