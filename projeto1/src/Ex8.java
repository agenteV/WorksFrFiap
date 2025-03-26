import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de apenas 3 digitos: ");
        int numero = sc.nextInt();

        int dezena = (numero / 10) %10;

        System.out.println("A dezena do número é: "+dezena);

        sc.close();
    }
}
