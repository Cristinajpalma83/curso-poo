import java.util.Scanner;

// Dado el radio de un círculo, calcular su perímetro y su área
public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double radio, perimetro, area;
        
        System.out.print("Ingrese radio: ");
        radio = tec.nextDouble();

        perimetro = 2 * Math.PI * radio;
        // area = Math.PI * radio * radio;
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}