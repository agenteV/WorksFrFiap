import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra, frase;
        int idade;

        System.out.print("Palavra ------> ");
        palavra = sc.next();

        System.out.print("idade -------> ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Frase ------> ");
        frase = sc.nextLine();


        System.out.println(frase);
        System.out.println(palavra);
        System.out.println(idade);

    }
}