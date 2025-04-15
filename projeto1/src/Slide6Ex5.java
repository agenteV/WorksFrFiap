import java.util.Scanner;

public class Slide6Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x,y,z;

        System.out.println("Digite o primeiro valor: ");
        x = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        y = sc.nextDouble();
        System.out.println("Digite o terceiro valor");
        z = sc.nextDouble();

        if (x < y + z && y < x + z && z < x + y ){
            System.out.println("Os valores podem se formar um triangulo!");
        }
        else {
            System.out.println("Estes valores não podem ser um triangulo");
        }



    }
}
