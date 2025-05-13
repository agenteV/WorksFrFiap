import java.util.Scanner;

public class ex5Slide9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        int x=1,y=1,z;
        int cont;

        System.out.println("Qual a quantidade de números: ");
        quantidade = sc.nextInt();
        if (quantidade ==1){
            System.out.println(x);
        }
        else if (quantidade ==2){
            System.out.println(x + "" + y);
        }
        else {
            System.out.println(x + "" + y);
            cont=3;
            while (cont <= quantidade){
                z = x + y;
                System.out.println(z + "");
                x=y;
                y=z;
                cont ++;
            }
        }

    }
}
