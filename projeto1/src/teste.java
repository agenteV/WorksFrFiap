import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y ;

        System.out.println("Informe o valor de x: ");
        x = sc.nextInt();

        System.out.println("Informe o valor de y: ");
        y = sc.nextInt();

        double potencia = Math.pow(x,y);
        double raiz = Math.sqrt(x+y);

        System.out.println(potencia);
        System.out.println(raiz);
    }
}
