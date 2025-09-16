import java.util.Random;

public class MatrizDiagonais {
    public static void main(String[] args) {
        // Definindo o tamanho da matriz
        int tamanho = 4;

        // Criando a matriz
        int[][] matriz = new int[tamanho][tamanho];

        // Inicializando o gerador de números aleatórios
        Random rand = new Random();

        // Preenchendo a matriz com números aleatórios
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = rand.nextInt(10); // Valores aleatórios entre 0 e 9
            }
        }

        // Exibindo a matriz gerada
        System.out.println("Matriz Gerada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a soma da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalPrincipal += matriz[i][i]; // Elementos da diagonal principal
        }

        // Calculando a soma da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalSecundaria += matriz[i][tamanho - i - 1]; // Elementos da diagonal secundária
        }

        // Exibindo as somas
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
