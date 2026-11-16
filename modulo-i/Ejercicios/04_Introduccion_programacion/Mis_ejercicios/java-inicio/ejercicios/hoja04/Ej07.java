//Determine si un valor entero ingresado por teclado es un palíndromo (capicúa).
import java.util.Scanner;
public class Ej07{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int n, num, nInverso = 0, divisor = 10;        

        System.out.print("Ingrese un número: ");
        num = n = tec.nextInt();

        while (n > 0){
            nInverso = (nInverso * 10) + (n % divisor);            
            n = n / divisor;                    
        }       

        if (num == nInverso) {
            System.out.print(num + " es un palíndromo (capicúa)."); 
        } else {
            System.out.print(num + " No es un palíndromo (capicúa)."); 
        }

    }
}