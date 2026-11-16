//Ingresando un valor entero, muestre por pantalla sus dígitos en orden inverso, por ejemplo: INGRESO: 3589, SALIDA: 9853.
import java.util.Scanner;
public class Ej06{
    public static void main (String[] arg){
        //Como ir obteniendo la unidad dividiendo por 10, para recuperar 1254 --> 4, 5, 2, 1
        Scanner tec = new Scanner(System.in);
        int n, divisor = 10;

        System.out.print("INGRESO: ");
        n = tec.nextInt();

        System.out.print("SALIDA:  ");
        while (n > 0) {
            System.out.print(n % divisor);
            n = n/divisor;    
        }
    }
}