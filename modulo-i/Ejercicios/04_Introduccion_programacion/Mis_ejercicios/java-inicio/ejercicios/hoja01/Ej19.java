//Suponiendo que el primer día del año fue lunes, 
// escribir un programa que reciba un número con el día del año (de 1 a 366) e imprima el día de la semana que le toca. 
// Por ejemplo: si recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’
import java.util.Scanner;
public class Ej19{
    public static void main (String[] arg){
        int dia, diaSemana;
        Scanner tec = new Scanner(System.in);

        System.out.print("Ingrese un numero entero del 1 al 366: ");
        dia = tec.nextInt();

        //Las semanas tienen 7 dias --> dia % 7 == día de la semana (0-Domingo, 1-Lunes, 2-Martes, 3-Miercoles, 4-Jueves, 5-Viernes, 6-Sabado)
        diaSemana = dia % 7;
        if (diaSemana == 0){ System.out.print("El dia " + dia + " es " + diaSemana + " - Domingo"); }
        if (diaSemana == 1){ System.out.print("El dia " + dia + " es " + diaSemana + " - Lunes"); }
        if (diaSemana == 2){ System.out.print("El dia " + dia + " es " + diaSemana + " - Martes"); }
        if (diaSemana == 3){ System.out.print("El dia " + dia + " es " + diaSemana + " - Miercoles"); }
        if (diaSemana == 4){ System.out.print("El dia " + dia + " es " + diaSemana + " - Jueves"); }
        if (diaSemana == 5){ System.out.print("El dia " + dia + " es " + diaSemana + " - Viernes"); }
        if (diaSemana == 6){ System.out.print("El dia " + dia + " es " + diaSemana + " - Sábado"); }
    }
}