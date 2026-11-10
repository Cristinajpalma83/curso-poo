//Dados tres números, indicar el mayor y el menor valor de los tres.
import java.util.Scanner;
public class Ej08{
    public static void main (String[] arg){
        double n1, n2, n3;
        double mayor, menor;
        Scanner teclado = new Scanner(System.in);
        //Escribir y leer n1, n2 y n3
        System.out.println("Escriba el primer número: ");
        n1 = teclado.nextDouble();
        System.out.println("Escriba el segundo número: ");
        n2 = teclado.nextDouble();
        System.out.println("Escriba el tercer número: ");
        n3 = teclado.nextDouble();

        //Condicional 1
/*        if (n1 > n2 && n1 > n3) {               //n1 es mayor que n2 y n3
            System.out.println( n1 + " es mayor que " + n2 + " y " + n3);
            if (n2 > n3) {                      // n3 es menor que n2
                System.out.println( n3 + " es menor que " + n1 + " y " + n2);
            } else {                            // n2 es menor que n3
                System.out.println( n2 + " es mayor que " + n1 + " y " + n3);
            }
        } else if (n2 > n1 && n2 > n3) {        //n2 es mayor que n1 y n3
            System.out.println( n2 + " es mayor que " + n1 + " y " + n3);
            if (n1 > n3) {                      //n3 es menor que n1
                System.out.println( n3 + " es menor que " + n1 + " y " + n3);
            } else {                            //n1 es menor que n3
                System.out.println( n1 + " es menor que " + n2 + " y " + n3);
            }
        } else {                                //n3 es mayor que n1 y n2
            System.out.println( n3 + " es mayor que " + n1 + " y " + n2);
            if (n1 > n2 ){                      //n2 es menor que n1 
                System.out.println( n2 + " es menor que " + n1 + " y " + n3);
            } else {                            //n1 es menor que n2
                System.out.println( n1 + " es menor que " + n2 + " y " + n3);
            }
        } 
*/
        //Condicional 2 (refactorizado)
        mayor = menor = n1;
        if (n2 > mayor){
            mayor = n2;
        }
        if (n3 > mayor){
            mayor = n3;
        }
        if (n2 < menor){
            menor = n2;
        }
        if (n3 < menor){
            menor = n3;
        }
        System.out.println( mayor + " es el mayor");
        System.out.println( menor + " es el menor");
    }
}