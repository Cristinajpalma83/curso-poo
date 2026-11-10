import java.util.Scanner;

// Dados tres números, indicar el mayor y el menor valor de los tres.
public class Ej08 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double num1, num2, num3;
        double mayor, menor;

        System.out.print("Ingrese valor: ");
        num1 = tec.nextDouble();
        System.out.print("Ingrese valor: ");
        num2 = tec.nextDouble();
        System.out.print("Ingrese valor: ");
        num3 = tec.nextDouble();

        mayor = menor = num1;
        //mayor = num1;
        //menor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}