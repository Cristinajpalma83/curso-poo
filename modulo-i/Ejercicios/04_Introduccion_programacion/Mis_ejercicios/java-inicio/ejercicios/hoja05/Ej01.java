//Crea un programa que intercambie los valores de dos variables.
import java.util.Scanner;
public class Ej01{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int a, b, aux;

        System.out.print("Introduce el primer número (a): ");
        a = tec.nextInt();
        System.out.print("Introduce el segundo número (b): ");
        b = tec.nextInt();

        aux = a;
        a = b;
        b = aux;
        System.out.println("Ahora a = " + a + " y b = " + b);
    }
}