import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //declaracao de variavel
        Scanner sc = new Scanner(System.in);
        double base, altura, area, perimetro;

        //entrada de dados
        System.out.print("Digite o valor da base: ");
        base = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        altura = sc.nextDouble();

        //processamento
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);

        //saida de dados
        System.out.println("área = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
