import java.util.Scanner;

// Hacer un algoritmo que permita Obtener la cantidad de horas, minutos y segundos 
//  de un tiempo dado en segundos.
public class Ej11 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese segundos: ");
        int segundos_ini = tec.nextInt();

        int horas = segundos_ini / 3600;
        int minutos = (segundos_ini % 3600) / 60;
        int segundos = segundos_ini % 60;

        System.out.println(segundos_ini + " son " + horas + ":" + minutos + ":" + segundos);
    }
}