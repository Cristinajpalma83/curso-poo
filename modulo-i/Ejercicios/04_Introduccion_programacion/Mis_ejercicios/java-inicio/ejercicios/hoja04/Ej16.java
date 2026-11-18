//Realizar el juego “Adivina número”. 
// El ordenador debe generar un número “secreto” aleatorio con las siguientes características:
//  - Debe tener 4 dígitos diferentes
//  - No puede comenzar en 0 
// El usuario debe adivinarlo, para ello irá ingresando números de 4 cifras 
// y el programa le indicará la cantidad de dígitos correctos y la cantidad de dígitos regulares. 
// Un dígito es correcto cuando está en la posición que le corresponde y es regular si está en el número secreto, pero en otra posición.
import java.util.Scanner;
public class Ej16{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int r1, r2, r3, r4, random, ini = 0, fin = 9, cant;
        int n, n1, n2, n3, n4;

        // Calcular dígito a dígito el número random. Ojo, los 4 dígitos tienen que ser distintos        
            cant = fin - ini + 1; 
            r1 = r2 = r3 = r4 = (int) Math.floor(Math.random() * cant) + ini;            

            while (r1 == r2){
                r2 = (int) Math.floor(Math.random() * cant) + ini;
                while (r2 == r3 || r1 == r3){
                    r3 = (int) Math.floor(Math.random() * cant) + ini;
                    while (r3 == r4 || r2 == r4 || r1 == r4){
                        r4 = (int) Math.floor(Math.random() * cant) + ini;
                    }
                }
            }
            random = r1 * 1000 + r2 * 100 + r3 * 10 + r4;
            //System.out.println(random);

        // Pedir al usuario su número
        System.out.print("Introduca un número de 4 cifras: ");
        n = tec.nextInt();
        //Descomponer el numero del usuario en dígitos
        n4 = n % 10;
        n3 = (n - n4) % 100;
        n2 = (n - n3 - n4) % 1000;
        


        //Compara numero del usuario con el random generado, dígito a dígito


    }
}