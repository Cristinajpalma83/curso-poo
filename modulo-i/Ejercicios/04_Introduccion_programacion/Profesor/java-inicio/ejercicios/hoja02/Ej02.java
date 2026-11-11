import java.util.Scanner;

//Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por teclado
public class Ej02 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int cont = 1, n;
        double num, suma = 0;
        System.out.print("Ingrese numero natural: ");
        n = tec.nextInt();

        while (cont <= n){
            // suma = suma + cont;
            suma += cont;

            cont++;
        }
        System.out.println("Sumatorio: " + suma);
    }
}