import java.util.Scanner;

public class Ex5Slide7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int menor,medio,maior;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        c = sc.nextInt();

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                maior = c;
            } else {
                medio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                maior = c;
            } else {
                medio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                maior = b;
            } else {
                medio = b;
                maior = a;
            }
    }
        System.out.println("Os valores em ordem crescente serão: "+menor+","+medio+","+maior);
}
}