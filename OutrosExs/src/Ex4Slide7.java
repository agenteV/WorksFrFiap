import java.util.Scanner;

public class Ex4Slide7 {
    public static void main(String[] args) {
        int valor1, valor2, valor3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = sc.nextInt();

        if (valor1 != valor2 && valor1 != valor3 && valor2 !=valor3  ){
            int menor = valor1;

            if (valor2 < menor) {
                menor = valor2;
            }
            if (valor3 < menor){
                menor = valor3;
            }
            System.out.println("O menor valor é: "+menor);
        } else {
            System.out.println("Os valores não são diferentes entre si");
        }
        }
    }

