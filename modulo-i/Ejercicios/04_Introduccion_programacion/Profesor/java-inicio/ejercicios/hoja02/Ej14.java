import java.util.Scanner;

//Escribir un programa que pida al usuario un número entero positivo y muestre 
// la cuenta atrás desde ese número hasta cero, separados por comas.
public class Ej14 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingrese valor positivo: ");
            n = tec.nextInt();
        } while(n < 0);
        
        for (int i = n; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println(0);
    }
}