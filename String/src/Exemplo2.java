import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int TotalDeVogais = 0;
        char[] letra;
        char aux;

        System.out.print("Frase -----> ");
        frase = sc.nextLine();

        letra = frase.toCharArray();

        for (int  i = 0; i < letra.length; i++ ){
            System.out.print(letra[i] + "\t");

        }

        System.out.println();
        for ( int i = 0; i < frase.length(); i++){
            System.out.print(frase.charAt(i)+"\t");
        }

        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++){
            aux = frase.charAt(i);
            switch (aux){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    TotalDeVogais++;

            }

        }

        System.out.println("Total de Vogais = " + TotalDeVogais);

    }
}
