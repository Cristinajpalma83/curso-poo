import java.util.Scanner;

//Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario, 
// incluidos los extremos si son pares
public class Ej08 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int desde, hasta;
        System.out.print("Ingrese limite inferior: ");
        desde = tec.nextInt();

        System.out.print("Ingrese limite superior: ");
        hasta = tec.nextInt();

        if (desde % 2 != 0)
            desde++;

        for (int i = desde; i <= hasta; i+=2) {
            System.out.println(i);
        }
    }
}