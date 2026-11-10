//Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos.
import java.util.Scanner;
public class Ej05{
    public static void main (String[] arg){
        int n, contador = 1, nPositivo = 0;
        double num;
        Scanner tec = new Scanner(System.in);

        System.out.print("Indica la cantidad de números a ingresar: ");
        n = tec.nextInt();

        while (contador <= n){
            System.out.print("Ingrese número: ");
            num = tec.nextDouble();

            if (num > 0) {
                nPositivo = nPositivo + 1;
            }

            contador++;
        }
        System.out.println("Has introducido " + nPositivo + " números positivos");
    }
}