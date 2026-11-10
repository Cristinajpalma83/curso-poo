// Hacer un algoritmo que permita Obtener la cantidad de horas, minutos y segundos de un tiempo dado en segundos.
import java.util.Scanner;
public class Ej11{
    public static void main (String[] arg){
        int hora, minuto, segundo, cociente;
        Scanner tec = new Scanner(System.in);

        System.out.println("Escriba una cifra en segundos: ");
        cociente = tec.nextInt();

        //calcular 
        segundo = cociente % 60;  //resto de la cifra de entrada al dividorla por 60 segundos
        cociente = cociente / 60; //el cociente de dividir la cifra de entrada por 60 segundos

        minuto = cociente % 60; 
        hora = cociente / 60; 

        System.out.println(hora + " horas " + minuto + " minutos " + segundo + " segundos");
    }
}