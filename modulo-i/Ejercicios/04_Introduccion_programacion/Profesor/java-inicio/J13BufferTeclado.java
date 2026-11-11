import java.util.Scanner;

public class J13BufferTeclado {
    public static void main() {
        Scanner tec = new Scanner(System.in);

        int num1 = tec.nextInt();
        int num2 = tec.nextInt();
        int num3 = tec.nextInt();
        tec.nextLine(); //limpia el buffer

        System.out.print("Ingresa nombre: ");
        String nombre = tec.nextLine();
    }
}