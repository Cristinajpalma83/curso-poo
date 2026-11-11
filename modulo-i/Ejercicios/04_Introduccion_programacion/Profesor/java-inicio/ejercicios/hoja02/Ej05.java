import java.util.Scanner;

//Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos
public class Ej05 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int n, contPos = 0;
        double num;
        System.out.print("Ingrese cantidad de valores: ");
        n = tec.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese valor: ");
            num = tec.nextDouble();
            if (num > 0)
                contPos++;
        }

        System.out.println("Ha ingresado " + contPos + " valores positivos");
    }
}