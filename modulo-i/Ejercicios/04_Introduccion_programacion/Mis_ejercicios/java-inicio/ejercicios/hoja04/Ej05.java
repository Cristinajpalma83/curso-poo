//Repetir el ejercicio anterior, pero ingresando un número entero de cualquier cantidad de cifras.
import java.util.Scanner;
public class Ej05{
    public static void main (String[] arg){
        //Como ir obteniendo la unidad dividiendo por 10, para recuperar 1254 --> 4, 5, 2, 1
        Scanner tec = new Scanner(System.in);
        int n, divisor = 10;

        System.out.print("Ingrese número: ");
        n = tec.nextInt();

        while (n != 0) {
            System.out.println(n % divisor);
            n = n/divisor;    
        }
    }
}