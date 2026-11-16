import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

// Escribir un programa que pida al usuario un número, que representará una cantidad de
// dinero expresada en euros. A continuación, el programa le ofrecerá un menú al usuario en
// el que le preguntará a qué divisa quiere convertir del dinero e imprimirá la conversión. Las
// posibles divisas son las siguientes (se indica el tipo de cambio):
//  • Dólares (1 dólar = 0,88 euros)
//  • Libra Esterlina (1 Libra = 1,20 euros)
//  • Yen (1 yen = 0,0077 euros).
//  • Dólares Canadienses (1 dólar C. = 0,71 euros)

public class Ej05 {
    public void main() {
        Scanner tec = new Scanner(System.in);
        double euros;
        boolean salir = false;
        int opcion;

        double dolar = 0.88, libra = 1.2, yen = 0.0077, canada = 0.71;
        double factor;
        String divisa = "";

        System.out.print("Ingrese importe: ");
        euros = tec.nextDouble();


        do {
            System.out.print(
                """
                
                0 - Otro importe
                1 - Dólares
                2 - Libra Esterlina
                3 - Yen
                4 - Dólares Canadienses
                9 - Salir
                """
            );
            System.out.print(">");
            opcion = tec.nextInt();

            switch(opcion) {
                case 0 -> {
                    System.out.print("Ingrese importe: ");
                    euros = tec.nextDouble();
                    tec.nextLine();
                    factor = 0;
                }
                case 1 -> {
                    factor = dolar;
                    divisa = "$";
                }
                case 2 -> {
                    factor = libra;
                    divisa = "libras";
                }
                case 3 -> {
                    factor = yen;
                    divisa = "Yen";
                }
                case 4 -> {
                    factor = canada;
                    divisa = "CA$";
                }
                case 9 -> {
                    factor = 0;
                    salir = true;
                }
                default -> {
                    factor = 0;
                }
            }
            if (factor != 0) {
                System.out.println("\n" + euros + " euros >>> "+ (Math.round(euros / factor * 100) / 100.) + " " + divisa);
                tec.nextLine();
            }
        } while(!salir);

    }
}