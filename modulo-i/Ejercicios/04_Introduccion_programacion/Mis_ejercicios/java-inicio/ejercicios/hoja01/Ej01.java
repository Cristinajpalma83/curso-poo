//Dado un número cualquier por teclado, mostrar su valor absoluto.
import java.util.Scanner;
public class Ej01{
    public static void main (String[] arg){
        //Definir variables
        double numero;
        Scanner teclado = new Scanner(System.in);
        //Escribir numero
        System.out.println("Introduzca un número: ");
        //Leer número
        numero = teclado.nextDouble();
        //Condicional para escribir el valor absoluto
        if (numero < 0) {
            System.out.println("El valor absoluto de |" + numero + "| es: " + numero*-1);
        }else{
            System.out.println("El valor absoluto de |" + numero + "| es: " + numero);
        }
    }
}