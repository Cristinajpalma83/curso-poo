//Escribir un programa que pida al usuario un número entero positivo 
// y muestre la cuenta atrás desde ese número hasta cero, separados por comas.
import java.util.Scanner;
public class Ej14{
    public static void main (String [] arg){
        int n;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        n = tec.nextInt();       

        for (int i = n ; i > 0; i--){
            System.out.print(i + ", ");
        }
        System.out.print("0");
    }
}