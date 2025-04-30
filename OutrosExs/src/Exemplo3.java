public class Exemplo3 {
    public static void main(String[] args) {
        int valor = 10;

        if (valor % 2 == 0){
            System.out.println("é par");
        }
        else {
            System.out.println("é impar");
        }

        switch (valor % 2){
            case 0:
                System.out.println("par");
                break;
            default:
                System.out.println("é impar");
        }
    }
}
