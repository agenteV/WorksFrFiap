import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int ordem = random.nextInt(1,7);
        int [][] matriz = new int[ordem][ordem];
        int aux, k;
        //

        System.out.println("Valores Originais");
        for (int i = 0 ; i < ordem;i++ ){
            for (int j = 0; j < ordem; j++){
                matriz[i][j] = random.nextInt(3,20);
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        //
        k = ordem -1;
        for (int i = 0; i < ordem; i++){
            aux = matriz[i][i];
            matriz[i][i] = matriz[i][k];
            matriz[i][k] = aux;
            k--;
        }



        //

        for (int i = 0 ; i < ordem;i++ ) {
            for (int j = 0; j < ordem; j++) {
                System.out.println(matriz[i][j] + "\tImpressão após a troca dos elementos: ");
            }
            System.out.println();
        }
        //


    }
}
