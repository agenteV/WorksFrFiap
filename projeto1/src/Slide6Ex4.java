import java.util.Scanner;

public class Slide6Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;


        System.out.println("Digite o valor do x: ");
        x = sc.nextDouble();

        if (x > 5 || x < -5){
            y = 8 / Math.sqrt(x * x -25);
            System.out.println("y = " + y);
        }
        else {
            System.out.println("Valor invalido para x");
        }

    }
}
