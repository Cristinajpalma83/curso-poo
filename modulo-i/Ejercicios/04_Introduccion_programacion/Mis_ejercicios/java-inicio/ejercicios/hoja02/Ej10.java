//Dado un número entero n, imprimir su tabla de multiplicar del 1 al 9.
import java.util.Scanner;
public class Ej10{
    public static void main (String[] arg){
        int n;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        n = tec.nextInt();

        for (int i = 1; i <= 9; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}