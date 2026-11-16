//Escriba un programa que imprima los siguientes patrones por separado, 
// uno debajo del siguiente, una vez que el usuario ingresó el tamaño, por ejemplo 5. 
// Utilice ciclos for para generar los patrones. 
// Todos los asteriscos deberán ser impresos por un solo enunciado print de la forma print(‘*’). 
// Sugerencia: los dos últimos patrones requieren que cada línea comience con un número correcto de espacios en blanco: print(‘ ’).
//* ***** ***** *
//** **** **** **
//*** *** *** ***
//**** ** ** ****
//***** * * *****
import java.util.Scanner;
public class Ej08{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int n, cont;

        System.out.print("Ingrese tamaño: ");
        n = tec.nextInt();

        System.out.println("Imprimo un cuadrado:");
        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }        
        System.out.println();

        System.out.println("Patrón 1: ");
        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }        
        System.out.println();


        System.out.println("Patrón 2: ");
        for (int i = 1 ; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Patrón 3: ");
        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Patrón Prueba: ");
        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}