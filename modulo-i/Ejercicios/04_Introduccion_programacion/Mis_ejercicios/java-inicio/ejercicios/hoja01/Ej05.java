//Dado el radio de una esfera, calcular su volumen. 𝑉=4/3𝜋𝑟3
import java.util.Scanner;

public class Ej05 {
    public static void main (String [] arg){
        //Definir variables
        double radio, volumen;
        Scanner teclado = new Scanner (System.in);
        //Escribir radio
        System.out.println ("Ingrese el radio de la esfera: ");
        //Leer radio
        radio = teclado.nextDouble();
        //Calcular volumen
        volumen = (4./3) * Math.PI * Math.pow(radio, 3);
        //Escribir volumen
        System.out.println("El volumen de la esfera es: 4/3 * Pi * " + radio + " ^3 = " + volumen);
    }    
}