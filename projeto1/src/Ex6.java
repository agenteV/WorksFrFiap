import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        double x,y ;

        System.out.println("Informe o valor x: ");
        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - 1.0 / 2));
        System.out.println("y = "+ df.format(y));


    }
}
