//Hacer un algoritmo que permita obtener la cantidad de segundos en un tiempo dado en horas, minutos y segundos
import java.util.Scanner;
public class Ej10{
    public static void main (String[] arg){
        int hora, minuto, segundo, cantidadSegundos;
        Scanner tec = new Scanner(System.in);

        System.out.print("Indique la hora (HH): ");
        hora = tec.nextInt();
        System.out.print("Indique el minuto (MI): ");
        minuto = tec.nextInt();
        System.out.print("Indique el segundo (SS): ");
        segundo = tec.nextInt();

        //calcular la cantidad de segundos
        cantidadSegundos = segundo + (minuto * 60) + (hora * 3600);
        System.out.println("El tiempo: " + hora + ":" + minuto + ":" + segundo + " se corresponde con: " + cantidadSegundos + " segundos");
    }
}