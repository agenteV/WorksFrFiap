public class Exemplo3 {
    public static void main(String[] args) {
        int valor = 4;
        switch (valor){
            case 1,2:
                System.out.println("A");
            case 3,4:
                System.out.println("E");
            case 5,6:
                System.out.println("I");
            default:
                System.out.println("X");
        }
    }
}
