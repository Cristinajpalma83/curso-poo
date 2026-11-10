import java.util.Scanner;

// Hacer un programa que Dado un año indicar si es bisiesto. 
//  Un año es bisiesto si es un número divisible por 4, 
//  pero si es divisible por 100 debe ser es divisible por 400.
public class Ej14 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese año: ");
        int anyo = tec.nextInt();
        String siNo;
        if (anyo % 400 == 0) {
            siNo = "si";
        } else if (anyo % 100 == 0) {
            siNo = "no";
        } else if (anyo % 4 == 0) {
            siNo = "si";
        } else {
            siNo = "no";
        }
        System.out.println("El año " + anyo + " " + siNo + " es bisiesto");

        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
            siNo = "si";
        } else {
            siNo = "no";
        }
        System.out.println("El año " + anyo + " " + siNo + " es bisiesto");

    }
}