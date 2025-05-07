import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor maior que o primeiro: ");
        b = sc.nextInt();

        while (a>b){
            System.out.println("Digite um valor maior que " + a);
            b = sc.nextInt();
        }
        while (a<=b){
            System.out.println(a);
            a++;
        }
    }
}
