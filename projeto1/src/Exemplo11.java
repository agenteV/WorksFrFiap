import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.println("A media final é: "+df.format(media));

        if (media >= 6){
            System.out.println("Você foi aprovado, parabéns!");
        }
        else {
            System.out.println("Você esta reprovado, repetiu!");
        }
    }
}
