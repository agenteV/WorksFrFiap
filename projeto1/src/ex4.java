import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double valorqw, salario, valor, qwcasa, desconto;


        System.out.print("Digite o valor do salário mínimo: ");
        salario = sc.nextDouble();
        System.out.print("Digite a quantidade de QW gasta pela residência: ");
        qwcasa = sc.nextDouble();

        valorqw = (salario/700);
        valor = valorqw * qwcasa;
        desconto = valor * 0.9;
        System.out.println("O valor gasto em reais por cada qw é R$" + df.format(valorqw));
        System.out.println("O valor a ser pago pela residencia é R$" + df.format(valor));
        System.out.println("O valor com desconto de 10% é R$" + df.format(desconto));


    }
}
