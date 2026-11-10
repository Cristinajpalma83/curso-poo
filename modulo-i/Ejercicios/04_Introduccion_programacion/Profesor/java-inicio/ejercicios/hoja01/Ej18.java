import java.util.Scanner;

// Escribir un programa que dados dos puntos en el plano 
//  𝐴(𝑥1,𝑦1) y 𝐵(𝑥2,𝑦2), imprima la distancia entre ambos
public class Ej18 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;

        System.out.print("Ingrese punto A separado por espacio: ");
        x1 = tec.nextDouble();
        y1 = tec.nextDouble();
        System.out.print("Ingrese punto B separado por espacio: ");
        x2 = tec.nextDouble();
        y2 = tec.nextDouble();

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("d(A, B) =  " + distancia);

    }
}