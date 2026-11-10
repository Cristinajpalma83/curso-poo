import java.util.Scanner;

// Dados los lados de un rectángulo, calcular su perímetro y su área
public class Ej02 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double lado1, lado2, perimetro, area;
        
        System.out.print("Ingrese lado 1: ");
        lado1 = tec.nextDouble();

        System.out.print("Ingrese lado 2: ");
        lado2 = tec.nextDouble();

        perimetro = 2 * (lado1 + lado2);
        area = lado1 * lado2;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}