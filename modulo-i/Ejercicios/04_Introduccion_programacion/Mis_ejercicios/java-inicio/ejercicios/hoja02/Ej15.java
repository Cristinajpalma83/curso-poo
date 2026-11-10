//Escriba un programa que pida un número entero mayor que cero y muestre todos sus divisores.
import java.util.Scanner;
public class Ej15{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int n, divisor;

        System.out.print("Ingrese in número entero mayor que 0: ");
        n = tec.nextInt();

        System.out.print("Los divisores de " + n + " son:");
        for (int i = 1; i <= n; i++){            
            if (n % i == 0){
                divisor = i;
                System.out.print(" " + divisor);
            }
        }
    }
}