//El programa generará un número aleatorio entre 0 y 100 y le pedirá al usuario que lo adivine. 
// Cuando el usuario ingrese el número para ver si acertó, 
// el programa le indicará si el número a adivinar es mayor, menor o bien si acertó. 
// Cuando acierte, finaliza.
import java.util.Scanner;

public class Ej03{
    public static void main (String[] arg){        
        Scanner tec = new Scanner(System.in);
        int a, n, ni = 0, nf = 100, mayor, menor;
        
        // genero mi numero entero aleatorio con Math.random() (decimal entre 0.0 y 1.0)
        //Math.ceil --> Redondeo hacia la derecha (menor entero, mayor que el número dado 2.25 = 3)
        //type cast --> cambio de tipo de dato (int)
        a = (int) Math.ceil( (Math.random() * (nf - ni + 1)) + ni);
        //System.out.println("Mi número aleatorio es: " +  a);

        System.out.print("Adivine el número entero (de 0 a 100): ");
        n = mayor = menor = tec.nextInt();

        while (a != n) {
            if (n > a){
                System.out.println("Tu número es mayor");
            } else {
                System.out.println("Tu número es menor");
            }
            System.out.print("Vuelve a intentarlo: ");
            n = tec.nextInt();
        }
        System.out.print("Correcto! el número es el " + a);
    }
}

