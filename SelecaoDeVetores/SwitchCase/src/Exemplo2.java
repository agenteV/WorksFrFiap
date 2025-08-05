public class Exemplo2 {
    public static void main(String[] args) {
        int valor = 1;
        switch (valor){
            case 1:
            case 2:
                System.out.println("A");
            case 3:
            case 4:
                System.out.println("E");
            case 5:
            case 6:
                System.out.println("I");
            default:
                System.out.println("X");
        }
    }
}
