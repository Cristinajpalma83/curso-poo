//Escribir un programa que dados dos puntos en el plano 𝐴(𝑥1,𝑦1) y 𝐵(𝑥2,𝑦2), imprima la distancia entre ambos.
//𝑑(𝐴,𝐵)= √(𝑥2− 𝑥1)2+(𝑦2− 𝑦1)2
import java.util.Scanner;
public class Ej18{
    public static void main (String[] arg){
        double x1, y1, x2, y2, distancia;
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduzca la coordenada x del punto A: ");
        x1 = tec.nextDouble();
        System.out.print("Introduzca la coordenada y del punto A: ");
        y1 = tec.nextDouble();
        System.out.print("Introduzca la coordenada x del punto B: ");
        x2 = tec.nextDouble();
        System.out.print("Introduzca la coordenada y del punto B: ");
        y2 = tec.nextDouble();

        //Calculo de potencia base^exponente: Math.pow(base, exp)
        //Calcula la raiz cuadrada de num: Math.sqrt(num)
        distancia = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

        System.out.print("La distancia entre los puntos A y B es: " + distancia);
    }
}