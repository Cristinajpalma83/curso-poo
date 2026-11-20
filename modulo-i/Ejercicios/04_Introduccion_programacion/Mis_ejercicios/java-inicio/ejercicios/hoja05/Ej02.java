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

        b+=a; //b = b + a
        a-=b; //a = a -b

        System.out.println("a = " + a + " b = " + b);
    }
}