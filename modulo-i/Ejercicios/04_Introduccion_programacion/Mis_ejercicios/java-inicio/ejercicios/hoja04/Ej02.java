//Escriba un programa que lea el lado de un cuadrado por teclado y a continuación lo muestre por pantalla en forma de asteriscos. 
// Por ejemplo, ingresado el valor 4 la salida será: 
// ****
// **** 
// **** 
// ****
import java.util.Scanner;
public class Ej02{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int lado;

        System.out.print("Ingrese el lado de un cuadrado: ");
        lado = tec.nextInt();

        for (int i = 1; i <= lado; i++){
            for (int j = 1; j <= lado; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}