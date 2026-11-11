import java.util.Scanner;

//Dado un número entero n, imprimir su tabla de multiplicar del 1 al 9.
public class Ej10 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingresa que tabla quieres: ");
        int tabla = tec.nextInt();

        System.out.println("TABLA DEL " + tabla);
        for (int i = 1; i <= 9; i++)
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
    }
}