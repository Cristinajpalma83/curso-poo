//Escribe un método que retorne la suma de los dígitos de un número entero (ejemplo: 1234 - > 1+2+3+4 = 10).
import java.util.Scanner;
public class Ej03{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int n, suma = 0;

        System.out.print("Indique un número entero: ");
        n = tec.nextInt();

        while (n % 10 != 0) {
            suma = suma + n % 10; 
            n = n / 10;
        }


        System.out.println(suma);
    }
}