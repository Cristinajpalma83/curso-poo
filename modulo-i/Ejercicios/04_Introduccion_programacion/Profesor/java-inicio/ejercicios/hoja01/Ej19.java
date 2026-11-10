import java.util.Scanner;

// Suponiendo que el primer día del año fue lunes, escribir un programa que reciba un número 
//  con el día del año (de 1 a 366) e imprima el día de la semana que le toca. 
//  Por ejemplo: si recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’
public class Ej19 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int dia;
        String nombreDia = "";

        System.out.print("Ingrese dia del año: ");
        dia = tec.nextInt();

        //condicional múltiple
        switch(dia % 7) {
            case 0:
                nombreDia = "Domingo";
                break;
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
        }

        System.out.println("El dia " + dia + " es " + nombreDia);

    }
}