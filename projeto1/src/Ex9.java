import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de apenas 3 digitos: ");
        int valor = sc.nextInt();

        int unidade = valor %10;
        int dezena = (valor / 10) %10;
        int centena = (valor /100) %10;

        int numeroInvertido = unidade * 100 + dezena * 10 + centena;
        System.out.println("O número invertido é: "+numeroInvertido);
    }
}
