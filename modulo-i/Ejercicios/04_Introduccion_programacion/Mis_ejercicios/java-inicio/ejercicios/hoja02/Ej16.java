//Escriba un programa que pida un número entero mayor que cero y muestre todos sus divisores.
import java.util.Scanner;
public class Ej16{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int n;
        String primo = "Si";

        System.out.print("Ingrese un número entero mayor que 2: ");
        n = tec.nextInt();

        System.out.print("El número " + n + " ");
        for (int i = 1; i <= n; i++){            
            if (i != 1 && i != n &&  n % i == 0) {
                    primo = "No";    
            }           
        }
        System.out.print(primo + " es primo");
    }
}