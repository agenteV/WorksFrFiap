import java.util.Scanner;

public class Ex11Slide8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;

        System.out.println("Digite uma letra: ");
        letra = sc.next();

        letra = letra.toLowerCase();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("é uma vogal!");
        }
        else {
            System.out.println("Não é uma vogal");
        }
    }
}
