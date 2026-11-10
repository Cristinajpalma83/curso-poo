//Dados la base y altura de un triángulo, calcular su área.
import java.util.Scanner;
public class Ej04 {
    public static void main (String[] arg){
        //Definir base, altura, area
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        //Escribir  base
        System.out.println("Introduzca la base del triángulo: ");
        // Leer base
        base = teclado.nextDouble();
        //Escribir altura
        System.out.println("Introduzca la altura del triángulo: ");
        //Leer altura
        altura = teclado.nextDouble();
        //Calcular area de un triángulo: a = b * a / 2
        area = base * altura / 2;
        //Escribir area
        System.out.println("El área del triángulo es: " + base + " * " + altura + " / 2 = " + area);
    }
}