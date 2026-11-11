//El programa generará un número aleatorio entre 0 y 100 y le pedirá al usuario que lo adivine. 
// Cuando el usuario ingrese el número para ver si acertó, 
// el programa le indicará si el número a adivinar es mayor, menor o bien si acertó. 
// Cuando acierte, finaliza.
import java.util.Scanner;
import java.util.Random;

public class Ej03{
    public static void main (String[] arg){        
        Scanner tec = new Scanner(System.in);
        Random r = new Random();
        int a, n, nf = 100, mayor, menor;
        
        a = r.nextInt(nf); // genero mi numero entero aleatorio hasta nf=100
        //System.out.print("Mi número aleatorio es: " +  a);

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

