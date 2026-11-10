//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. 
//Fórmula para la conversión: F = 9/5C + 32
import java.util.Scanner;
public class Ej09{
    public static void main (String[] arg){
        double F, C;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese los grados Fahrenheit: ");
        F = tec.nextDouble();

        //Convertir Fahrenheit en Celsius: C = (F - 32) * 5/9
        C = 5./9 * (F - 32);

        System.out.println(F + "º Fahrenheit son: " + C + "º Celsius");
    }
}