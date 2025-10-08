import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro e positivo -->");
        valor = sc.nextInt();

        if (valor < 0){
            System.out.println("O valor deve ser positivo");
        }
        else {
            Imprimir(valor);
        }


    }

    public static void Imprimir(int valor){
        for (int cont = 1; cont <= valor; cont++){
            if (valor % cont == 0){
                System.out.println(-cont + " " + cont);
            }
        }
    }


}
