//Escriba un programa que nos calcule el cambio que debe dar la caja de un supermercado: 
// Dado un precio y una cantidad de dinero, el programa nos dirá 
// cuántas monedas deben darse como cambio de tal forma que el número total de monedas sea mínimo.
import java.util.Scanner;
public class Ej15{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        double precio, pago, resto;
        int vuelta;
        int moneda, m200 = 200, m100 = 100, m50 = 50, m20 = 20, m10 = 10, m5 = 5, m2 = 2, m1 = 1;

        System.out.print("Precio: ");
        precio = tec.nextDouble() * 100;
        System.out.print("Dinero pagado: ");
        pago = tec.nextDouble() * 100;

        vuelta = (int) Math.round(pago - precio);
        System.out.println("vuelta en centimos = " + vuelta);
 
        if (vuelta / m200 > 0 ) {
            System.out.println(vuelta / m200 + " monedas de 2 Euros");
            vuelta = vuelta % m200;
        }
        if (vuelta / m100 > 0 ) {
            System.out.println(vuelta / m100 + " monedas de 1 Euro");
            vuelta = vuelta % m100;
        }
        if (vuelta / m50 > 0 ) {
            System.out.println(vuelta / m50 + " monedas de 50 centimos");
            vuelta = vuelta % m50;
        }
        if (vuelta / m20 > 0 ) {
            System.out.println(vuelta / m20 + " monedas de 20 centimos");
            vuelta = vuelta % m20;
        }
        if (vuelta / m10 > 0 ) {
            System.out.println(vuelta / m10 + " monedas de 10 centimos");
            vuelta = vuelta % m10;
        }
        if (vuelta / m5 > 0 ) {
            System.out.println(vuelta / m5 + " monedas de 5 centimos");
            vuelta = vuelta % m5;
        }
        if (vuelta / m2 > 0 ) {
            System.out.println(vuelta / m2 + " monedas de 2 centimos");
            vuelta = vuelta % m2;
        }
        if (vuelta / m1 > 0 ) {
            System.out.println(vuelta / m1 + " monedas de 1 centimos");  
        }   
    }
}