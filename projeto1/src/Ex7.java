import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        double x,y;
        double parte1,parte2;

        System.out.println("Informe o valor de y: ");
        x = sc.nextDouble();

        parte1 = Math.pow((Math.pow(x,4) - 1)/(2 * x * x) ,2);
        parte2 = x * x / 2;
        y = Math.sqrt(1 + parte1) - parte2;

        System.out.println("y = "+ df.format(y));

    }
}
