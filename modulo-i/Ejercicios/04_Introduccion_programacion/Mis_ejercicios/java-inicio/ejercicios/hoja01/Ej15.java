//Hacer un algoritmo que, dados los catetos de un triángulo rectángulo, calcule su hipotenusa.
//ℎ =√𝑎2+𝑏2, con h (hipotenusa), a y b (catetos)
import java.util.Scanner;
public class Ej15{
    public static void main (String[] arg){
        double a, b, h;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese el primer cateto: ");
        a = tec.nextDouble();
        System.out.print("Ingrese el segundo cateto: ");
        b = tec.nextDouble();

        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("La hipotenusa del triángulo es: " + h);
    }
}