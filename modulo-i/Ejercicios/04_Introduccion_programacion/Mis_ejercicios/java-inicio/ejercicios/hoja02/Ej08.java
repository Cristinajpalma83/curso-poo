//Escribir un programa que imprima todos los números pares 
// entre dos números que se le pidan al usuario, incluidos los extremos si son pares.
import java.util.Scanner;
public class Ej08{
    public static void main (String[] arg){
        int n1,n2, mayor, menor, cant, par = 0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        n1 = tec.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        n2 = tec.nextInt();

        //cual es el mayor y cual el menor?
        if (n1 >= n2) {
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }
        //Convertir al primer numero par tanto mayor como menor en el caso de que sean impares
        if (menor % 2 != 0) { 
            menor = menor + 1;
        } 
        if (mayor % 2 != 0){
            mayor = mayor - 1;
        }

        //calcular la cantidad de numeros pares que tendrá el listado 
        cant = (mayor - menor)/2;

        if (cant > 0) {
            System.out.print("listado de números pares: " + menor);
            par = menor;
        }

        for (int i = 1; i <= cant; i++){
            par = par + 2;
            System.out.print(", " + par);
        }        
    }
}