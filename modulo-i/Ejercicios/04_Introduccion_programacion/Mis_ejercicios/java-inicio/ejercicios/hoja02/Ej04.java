//De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.
import java.util.Scanner;
public class Ej04{
    public static void main (String[] arg){
        int n, contador =1;
        double num, mayor, menor = 0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Indique la cantidad de números que va a ingresar: ");
        n = tec.nextInt();

        num = mayor = menor;

        while (contador <= n){
            System.out.print("Ingrese número: ");
            num = tec.nextDouble();
            if (contador == 1){
                mayor = menor = num;

            }

            if (num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }
            contador++;
        }
        System.out.println(mayor + " es el mayor y " + menor + " es el menor");
    }
}