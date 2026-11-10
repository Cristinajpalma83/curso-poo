//Dados dos números, indicar el mayor y el menor valor de los dos
import java.util.Scanner;
public class Ej07{
    public static void main (String[] arg){
        //Declarar variables
        double n1, n2;
        Scanner teclado = new Scanner(System.in);
        //Escribir y leer n1 y n2
        System.out.println("Introduzca el primer número: ");
        n1 = teclado.nextDouble();
        System.out.println("Introduzca el segundo número: ");
        n2 = teclado.nextDouble();
        //Condicional para identificar cual es el mayor y cual el menor
        if (n1 > n2){
            System.out.println(n1 + " es mayor que " + n2);
            System.out.println(n2 + " es menor que " + n1);
        } else if (n1 < n2) {
            System.out.println(n2 + " es mayor que " + n1);
            System.out.println(n1 + " es menor que " + n2);
        } else {
            System.out.println(n1 + " es igual que " + n2);
        }
    }
}