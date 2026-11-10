//Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por teclado.
import java.util.Scanner;
public class Ej02{
    public static void main (String[] arg){
        int n = 1, cont = 1, suma = 0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números naturales a suma: ");
        n = tec.nextInt();

        while (cont <= n) {
            suma = suma + cont++;
            //System.out.println(suma);
        }

        System.out.println("La suma es: " + suma);
    }
}