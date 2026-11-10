//Dado el radio de un círculo, calcular su perímetro y su área.
import java.util.Scanner;
        //PI : Math.PI
        //Calculo de potencia base^exponente: Math.pow(base, exp)
        //Calcula la raiz cuadrada de num: Math.sqrt(num)
public class Ej03{
    public static void main (String[] arg){
        //Definir variables radio, perimetro, area
        double radio, perimetro, area;
        Scanner teclado = new Scanner(System.in);
        //Escribir radio de un circulo
        System.out.println("Ingrese el radio del círculo: ");
        //Leer radio
        radio = teclado.nextDouble();
        //calcular perímetro del círculo: p = 2 * Pi * radio
        perimetro = 2*Math.PI*radio;
        //Escribir perimetro
        System.out.println("El perimetro del círculo es: 2 * Pi * " + radio + " = " + perimetro);
        //Calcular area de un circulo: a = Pi * radio ^ 2
        area = Math.PI * Math.pow(radio, 2);
        //Escribir area
        System.out.println("El área del círculo es: Pi * " + radio + " ^2 = " + area);
    }
}