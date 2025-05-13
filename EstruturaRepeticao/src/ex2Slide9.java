import java.util.Scanner;

public class ex2Slide9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor,resultado;
        int cont = 0;
        int resposta = 1;

        System.out.println("Informe valores inteiros:");
        valor = sc.nextInt();
        cont=0;
        while (cont <= 10){
            resultado = valor * cont;
            System.out.println(valor + "x" + cont + "=" + resultado);
            cont++;
        }
        System.out.println("Digite (1) para finalizar a tabuada!");
        resposta = sc.nextInt();
    }
}
