import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[6];

        //armazenamento de números

        for(int i = 0; i < x.length; i++){
            System.out.println("Valor----> ");
            x[i] = in.nextInt();
        }

        //impressao de valores

        for(int i = 0; i < x.length; i++){
            System.out.println(x[i] + "");
        }
    }
}
