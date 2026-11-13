//Escribir un programa que pida al usuario un número, que representará una cantidad de dinero expresada en euros. 
// A continuación, el programa le ofrecerá un menú al usuario en el que le preguntará a qué divisa quiere convertir del dinero
//  e imprimirá la conversión. 
// Las posibles divisas son las siguientes (se indica el tipo de cambio):
//    •Dólares (1 dólar = 0,88 euros)
//    •Libra Esterlina (1 Libra = 1,20 euros)
//    •Yen (1 yen = 0,0077 euros).
//    •Dólares Canadienses (1 dólar C. = 0,71 euros)
import java.util.Scanner;
public class Ej05{
    public static void main (String[] arg){
        double nEuros, n = 0;
        String divisa= "Euros", divisas;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese una cantidad en Euros: ");
        nEuros = tec.nextDouble();
        tec.nextLine(); //limpiar buffer

        System.out.println("En cuál de estas divisas: ");
        System.out.println(" - Dólares (d)");
        System.out.println(" - Libre Esterlina (l)");
        System.out.println(" - Yen (y)");
        System.out.println(" - Dólares Canadienses (c)");
        System.out.print("quiere convertir la cantidad anterior: ");
        divisas = tec.nextLine();

        switch (divisas){
            case ("d"):
                n =  0.88;
                divisa = "Dólares";
                break;
            case "l":
                n = 1.2;
                divisa = "Libras Esterlinas";
                break;
            case "y":
                n = 0.0077;
                divisa = "Yenes";
                break;
            case "c":
                n = 0.71;
                divisa = "Dólares Canadienses";
                break;
            default:
                System.out.print("divisa incorrecta.");
        }
        if (divisas.equals("d") || divisas.equals("l") || divisas.equals("y") || divisas.equals("c")){
            System.out.println(nEuros + " convertidos en la nueva divisa son: " + nEuros / n + " " + divisa );
        }
    }
}