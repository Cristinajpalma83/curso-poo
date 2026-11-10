//Dados los lados de un rectángulo, calcular su perímetro y su área.
import java.util.Scanner;

public class Ej02{
    public static void main (String[] arg){
        //Definir variables base, altura, perimetro y area
        double base, altura, perimetro, area;
        Scanner teclado = new Scanner (System.in); //defino teclado para guardar el valor escrito por el usuario
        //Escribir base
        System.out.print("Ingresa el valor de la base del rectángulo: ");
        //Leer base
        base = teclado.nextDouble();
        //Escribir altura
        System.out.print("Ingresa el valor de la altura del rectángulo: ");
        //Leer altura
        altura = teclado.nextDouble();

        //Calcular perimetro de un rectángulo (P = 2*base + 2*altura)
        perimetro = 2*base + 2*altura;
        //Leer perimetro
        System.out.println("El perímetro del rectángulo es: 2*" + base + " + 2*" + altura + " = " + perimetro);

        //Calcular area (area = base * altura)
        area = base * altura;
        //Leer area
        System.out.println("El área del rectángulo es: " + base + " * " + altura + " = " + area);
    }
}