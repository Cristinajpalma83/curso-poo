//Imprimir la suma de n números ingresados por teclado. 
// La cantidad de números (n) se solicita al usuario al principio y se ingresa por teclado.
import java.util.Scanner;
public class Ej01{
    public static void main (String[] arg){
        int n, valor = 0, suma = 0, contador=0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a sumar: ");
        n = tec.nextInt();

        while (contador < n){
            System.out.print("Ingrese número: ");
            valor = tec.nextInt();
            suma = suma + valor;
            contador++;
        }
        System.out.println("La suma de los " + n + " números introducidos es: " + suma);
    }
}
