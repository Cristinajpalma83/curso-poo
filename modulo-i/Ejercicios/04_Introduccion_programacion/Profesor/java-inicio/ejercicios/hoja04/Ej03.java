import java.util.Scanner;

// Modifique el programa anterior para que imprima el perímetro del cuadrado de la siguiente
// manera:
// ****
// *  *
// *  *
// ****
public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese lado: ");
        int n = tec.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}