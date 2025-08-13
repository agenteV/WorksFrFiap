import java.util.Scanner;

public class ExTeste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[6];

        for(int i = 0; i < x.length; i++){
            System.out.println("Valor----> ");
            x[i] = in.nextInt();
        }

        System.out.println();
        for(int i = x.length-1;i>= 0;i--){
            System.out.println(x[i] + "");
        }

    }
}
