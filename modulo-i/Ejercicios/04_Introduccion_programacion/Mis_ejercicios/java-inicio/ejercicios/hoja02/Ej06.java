//Siguiendo la misma metodología de carga, calcular la cantidad de valores >= 0 y la cantidad menores que 0.
import java.util.Scanner;
public class Ej06{
    public static void main (String[] arg){
        int n, contador = 1, nPositivo = 0, nNegativo = 0;
        double num;
        Scanner tec = new Scanner(System.in);

        System.out.print("Indica la cantidad de números a ingresar: ");
        n = tec.nextInt();

        while (contador <= n){
            System.out.print("Ingrese número: ");
            num = tec.nextDouble();

            if (num >= 0) {
                nPositivo = nPositivo + 1;
            }
            if (num < 0){
                nNegativo = nNegativo + 1;
            }

            contador++;
        }
        System.out.println("Has introducido " + nPositivo + " números positivos y " + nNegativo + " números negativos");
    }
}