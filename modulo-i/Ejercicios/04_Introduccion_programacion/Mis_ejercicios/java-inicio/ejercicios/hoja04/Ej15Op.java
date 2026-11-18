//Escriba un programa que nos calcule el cambio que debe dar la caja de un supermercado: 
// Dado un precio y una cantidad de dinero, el programa nos dirá 
// cuántas monedas deben darse como cambio de tal forma que el número total de monedas sea mínimo.
import java.util.Scanner;
public class Ej15Op{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        double precio, pago, resto;
        int vuelta;
        int moneda = 200, m200, m100, m50, m20, m10, m5, m2, m1;

        System.out.print("Precio: ");
        precio = tec.nextDouble() * 100;
        System.out.print("Dinero pagado: ");
        pago = tec.nextDouble() * 100;

        vuelta = (int) Math.round(pago - precio);
        System.out.println("vuelta en centimos = " + vuelta);


        switch (moneda) {
            case 200: 
                moneda = 200;
                m200 = vuelta / moneda;
                if (m200 > 0) System.out.println(m200 + " monedas de 2 Euros");
                vuelta = vuelta % moneda;
            case 100: 
                moneda = 100;
                m100 = vuelta / moneda;
                if (m100 > 0) System.out.println(m100 + " monedas de 1 Euros");
                vuelta = vuelta % moneda;
            case 50: 
                moneda = 50;
                m50 = vuelta / moneda;
                if (m50 > 0) System.out.println(m50 + " monedas de  50 centimos");
                vuelta = vuelta % moneda;
            case 20:
                moneda = 20;
                m20 = vuelta / moneda;
                if (m20 > 0) System.out.println(m20 + " monedas de  20 centimos");
                vuelta = vuelta % moneda;                
            case 10:
                moneda = 10;
                m10 = vuelta / moneda;
                if (m10 > 0) System.out.println(m10 + " monedas de  10 centimos");
                vuelta = vuelta % moneda;
            case 5:
                moneda = 5;
                m5 = vuelta / moneda;
                if (m5 > 0) System.out.println(m5 + " monedas de  5 centimos");
                vuelta = vuelta % moneda;
            case 2:
                moneda = 2;
                m2 = vuelta / moneda;
                if (m2 > 0) System.out.println(m2 + " monedas de  2 centimos");
                vuelta = vuelta % moneda;
            case 1:
                moneda = 1;
                m1 = vuelta / moneda;
                if (m1 > 0) System.out.println(m1 + " monedas de  1 centimos");
        } 
    }
}