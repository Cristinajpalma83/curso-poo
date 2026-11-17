//Solicite al usuario un número que represente el mes e imprima su nombre y la cantidad de días que tiene (no contemplar años bisiestos).
import java.util.Scanner;
public class Ej10{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int n, dias;
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

        if (n == 2){ dias = 28; }
        if (n == 4 || n == 6 || n == 9 || n == 11) {
            dias = 30;
        } else {
            dias = 31;
        }

        if (n > 0 && n <= 12) {
            System.out.println(n + " - " + mes + " tiene " + dias + " días");
        } else {
            System.out.println(n + " - " + mes);
        }
    }
}