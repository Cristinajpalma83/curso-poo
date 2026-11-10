//Dados dos números reales, calcular su suma, diferencia, producto y división
import java.util.Scanner;
public class Ej06{
    public static void main (String[] arg){
        //Declarar variables n1,n2,suma,resta,producto,division
        double n1,n2,suma,resta,producto,division;
        Scanner teclado = new Scanner(System.in);
        //Escribir n1
        System.out.println("Introduzca el primer número");
        //Leer n1
        n1 = teclado.nextDouble();
        //Escribir n2
        System.out.println("Introduzca el segundo número");
        //Leer n2
        n2 = teclado.nextDouble();
        //Calcular
        suma = n1+n2;
        resta = n1-n2;
        producto = n1*n2;
        division = n1/n2;
        //Escribir resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La diferencia es: " + resta);
        System.out.println("El producto es: " + producto);
        System.out.println("La división es: " + division);
    }
}