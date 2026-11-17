//Solicite al usuario un número que represente el mes e imprima su nombre.
import java.util.Scanner;
public class Ej09{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int n;
        String mes;

        System.out.print("Indique número de mes: ");
        n = tec.nextInt();

        switch (n){
            case 1 -> mes = "Enero";
            case 2 -> mes = "Febrero";
            case 3 -> mes = "Marzo";
            case 4 -> mes = "Abril";
            case 5 -> mes = "Mayo";
            case 6 -> mes = "Junio";
            case 7 -> mes = "Julio";
            case 8 -> mes = "Agosto";
            case 9 -> mes = "Septiembre";
            case 10 -> mes = "Octubre";
            case 11 -> mes = "Noviembre";
            case 12 -> mes = "Diciembre";
            default -> mes = "No corresponde a un mes válido";            
        }
        System.out.println(n + " - " + mes);
    }
}