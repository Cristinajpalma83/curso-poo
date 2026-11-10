import java.util.Scanner;

// Dado un número cualquier por teclado, mostrar su valor absoluto.
public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double num, abs;
        
        System.out.print("Ingrese valor: ");
        num = tec.nextDouble();

        if (num >= 0) {
            abs = num;
        } else {
            abs = -num;
        }

        System.out.println("|" + num + "|" + " = " + abs);
    }
}