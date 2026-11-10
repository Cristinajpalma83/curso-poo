//Hacer un programa que Dado un año indicar si es bisiesto. 
// Un año es bisiesto si es un número divisible por 4, pero si es divisible por 100 debe ser divisible por 400.

import java.util.Scanner;
public class Ej14{
    public static void main (String[] arg){
        int ano;
        boolean bisiesto = false;
        Scanner tec = new Scanner(System.in);

        System.out.print ("Intruduzca un año (YYYY): ");
        ano = tec.nextInt();

        // Si el resto de dividir ano entre 4 es 0 == divisible por 4          
        // Y en el caso de que sea un año divisible por 100, debe ser divisible por 400 para que sea bisiesto
        if ((ano % 100 == 0 && ano % 400 == 0) && (ano % 4 == 0)) {
            bisiesto = true;
        }
            System.out.println("El año " + ano + " es bisiesto? " + bisiesto);               
    }
}


