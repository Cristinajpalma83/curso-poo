//Hacer un programa que dado un número entero n, indica si es o no par.
import java.util.Scanner;
public class Ej13{
    public static void main (String[] arg){
        int n;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        n = tec.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " es un número par");
        } else {
            System.out.println(n + " es un número impar");
        }
    }
}