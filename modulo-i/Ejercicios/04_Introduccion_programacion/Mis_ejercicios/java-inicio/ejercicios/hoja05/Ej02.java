//Crea un programa que intercambie los valores de dos variables sin usar una variable temporal.
import java.util.Scanner;
public class Ej02{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int a, b;

        System.out.print("Indique el valor de a: ");
        a = tec.nextInt();
        System.out.print("Indique el valor de b: ");
        b = tec.nextInt();

        //cual es mayor
        if ( a < b ) { 
            a = (a+b)/2; //suma devuelve el mayor
            b = (a-b)/2; //resta devuelve el menor
        } else {
            b = (a+b)/2; //suma devuelve el mayor
            a = (a-b)/2; //resta devuelve el menor
        }
        System.out.println("a = " + a + " b = " + b);
    }
}