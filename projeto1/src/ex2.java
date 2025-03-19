import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, f;

        System.out.print("Digite o valor em C: ");
        c = sc.nextDouble();

        f = (c * 9/5 ) + 32;
        System.out.println("Em F fica: " + f);


    }
}
