import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Por favor, digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        for (int valor : vetor) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);

        in.close();
    }
}
