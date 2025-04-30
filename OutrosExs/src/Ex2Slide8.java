import java.util.Scanner;

public class Ex2Slide8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um valor: ");
        x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("O número esta diferente de 1,2 e 3.");
        }
    }
}
