import java.util.Scanner;

public class Ex1Slide8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um valor: ");
        x = sc.nextInt();

        if (x == 1){
            System.out.println("1");
        }
        else if (x == 2){
            System.out.println("2");
        }
        else if (x == 3){
            System.out.println("3");
        }
        else {
            System.out.println("Digitou um valor diferente de 1,2 e 3.");
        }
    }
}
