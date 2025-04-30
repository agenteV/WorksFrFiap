import java.util.Scanner;

public class Ex11Slide8parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;

        System.out.println("Digite uma letra: ");
        letra = sc.next();

        letra = letra.toLowerCase();
       switch (letra){
           case "a":
           case "e":
           case "i":
           case "o":
           case "u":
               System.out.println("é uma vogal");
               break;
           default:
               System.out.println("não é uma vogal");

       }
    }
}
