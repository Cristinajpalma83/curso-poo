import java.util.Scanner;

// Escriba un programa que lea el lado de un cuadrado por teclado y a continuación lo
// muestre por pantalla en forma de asteriscos. Por ejemplo, ingresado el valor 4 la salida
// será:
// ****
// ****
// ****
// ****
public class Ej02 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese lado: ");
        int n = tec.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}