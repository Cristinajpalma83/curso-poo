import java.util.Scanner;

//Dado un número entero n positivo, imprimir su factorial.
public class Ej07 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int n, fact = 1;
        System.out.print("Ingrese valor: ");
        n = tec.nextInt();

        for (int i = 2; i <= n; i++) {
            fact *= i; // fact = fact * i;
        }

        System.out.println(n + "! = " + fact);
    }
}