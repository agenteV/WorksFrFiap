import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor binário de 4 bits (0000 - 1111): ");
        String binario = sc.nextLine();

        int decimal = Integer.parseInt(binario, 2);

        System.out.println("O valor decimal correspondente é: " + decimal);

    }
}
