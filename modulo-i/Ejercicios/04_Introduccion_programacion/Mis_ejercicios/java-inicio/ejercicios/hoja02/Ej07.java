//Dado un número entero n positivo, imprimir su factorial. 
// 0! = 1 1! = 1 2! = 2x1 = 2 3! = 3x2x1 = 6 4! = 4x3x2x1 = 24 5! = 120
import java.util.Scanner;
public class Ej07{
    public static void main (String[] arg){
        int n, factorial = 1, cont = 1;
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Ingrese número entero: ");
        n = tec.nextInt();
        while (cont < n){
            cont++;
            factorial = factorial * cont;            
        }
        System.out.println(n + "! = " + factorial);        
    }
}