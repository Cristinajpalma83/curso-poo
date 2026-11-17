//Solicite al usuario una fecha e indicar los días que faltan hasta fin de año.
import java.util.Scanner;
public class Ej14{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int cant, dia, mes, anyo, total = 365;

        System.out.print("Ingrese una fecha (dia mes y año separados por espacios): ");
        cant = dia = tec.nextInt();
        mes = tec.nextInt();
        anyo = tec.nextInt();

        for (int i = 1; i < mes; i++){
            
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                cant = cant + 30;
            } else {
                if (i == 2) { 
                    cant = cant + 28;
                } else {
                    cant = cant + 31;
                }
            }
        }
        System.out.println("Faltan  " + (total - cant) + " días hasta el fin de año ");
    }
}