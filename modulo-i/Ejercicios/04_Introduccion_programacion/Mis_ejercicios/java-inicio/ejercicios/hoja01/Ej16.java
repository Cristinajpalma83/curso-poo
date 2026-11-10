//Escribir un programa que le pregunte al usuario una cantidad de euros a invertir o capital inicial (Ci), 
// una tasa de interés anual (R) y un número de años (T) y muestre como resultado el monto final a obtener. 
// Como se irán retirando los intereses generados por año, se debe calcular con la fórmula de interés simple. 𝐼=𝐶∗𝑅∗𝑇
import java.util.Scanner;
public class Ej15{
    public static void main (String[] arg){
        double c, r, t, i, m;
        Scanner tec = new Scanner(System.in);

        System.out.print("Qué cantidad de Euros quiere invertir como Capital Inicial? ");
        c = tec.nextDouble();
        System.out.print("Cuál es la Tasa de interés anual? ");
        r = tec.nextDouble() / 100;
        System.out.print("Cuántos años va a invertir? ");
        t = tec.nextDouble();

        i = c*r*t;
        //Calcular el monto final: Capital inicial + intereses simples (que se han calculado en base al número de años)
        m = c + i;
        System.out.println("Su interés simple es: " + i);
        System.out.println("El monto final será de: " + m);
    }
}