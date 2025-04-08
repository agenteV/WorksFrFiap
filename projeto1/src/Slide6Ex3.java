import java.util.Scanner;

public class Slide6Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double totalCompras = sc.nextDouble();

        // Variáveis para o desconto e o valor a ser pago
        double desconto = 0.0;
        double valorPagar;

        // Verificando o valor do desconto
        if (totalCompras > 1000) {
            desconto = totalCompras * 0.15;  // 15% de desconto
        } else {
            desconto = totalCompras * 0.08;  // 8% de desconto
        }

        // Calculando o valor a ser pago
        valorPagar = totalCompras - desconto;

        // Exibindo o valor economizado e o valor a ser pago
        System.out.println("Valor economizado: R$ " + desconto);
        System.out.println("Valor a ser pago: R$ " + valorPagar);

    }
}
