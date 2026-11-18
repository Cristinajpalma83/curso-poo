import java.util.Scanner;

// Ingresando un número entero por teclado de 4 cifras, mostrar sus dígitos uno por línea.
public class Ej04y05 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese valor: ");
        int n = tec.nextInt();
        int aux = n;

        while (aux != 0) {
            System.out.println(aux % 10);
            aux /= 10;
        }

        // aux = n;
        // int cifras = (int) Math.ceil(Math.log10(n));
        // System.out.println(cifras);
    }
}