import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        if (formaTriangulo(lado1, lado2, lado3)) {
            String classificacao = classificarTriangulo(lado1, lado2, lado3);
            System.out.println("Classificação: " + classificacao);
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }

    public static boolean formaTriangulo(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    public static String classificarTriangulo(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}