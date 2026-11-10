//Escribir un programa que lea de teclado dos tiempos expresados en horas, minutos y segundos; 
// las sume 
// y muestre el resultado en horas, minutos y segundos por pantalla.
import java.util.Scanner;
public class Ej10{
    public static void main (String[] arg){
        int hora, minuto, segundo, segundos1, segundos2, suma;
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese el primer tiempo:");
        System.out.print("1.- Indique la hora (HH): ");
        hora = tec.nextInt();
        System.out.print("2.- Indique el minuto (MI): ");
        minuto = tec.nextInt();
        System.out.print("3.- Indique el segundo (SS): ");
        segundo = tec.nextInt();
        
        //calcular la cantidad de segundos
        segundos1 = segundo + (minuto * 60) + (hora * 3600);

        System.out.println("Ingrese el segundo tiempo:");
        System.out.print("1.- Indique la hora (HH): ");
        hora = tec.nextInt();
        System.out.print("2.- Indique el minuto (MI): ");
        minuto = tec.nextInt();
        System.out.print("3.- Indique el segundo (SS): ");
        segundo = tec.nextInt();

        segundos2 = segundo + (minuto * 60) + (hora * 3600);

        suma = segundos1 + segundos2;

        //Convertir suma en HH:MM:SS
        segundo = suma % 60; //resto en segundos
        suma = suma / 60; //cociente en minutos
        minuto = suma % 60; //resto en minutos
        hora = suma / 60;

        System.out.println("La suma de ambos tiempos es: " + hora + ":" + minuto + ":" + segundo );
    }
}