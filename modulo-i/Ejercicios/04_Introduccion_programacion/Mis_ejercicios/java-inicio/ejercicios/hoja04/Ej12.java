//Solicite al usuario una fecha e indicar los días que faltan hasta fin de mes.
import java.util.Scanner;
public class Ej12{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int dia, mes, anyo, n = 0;
        boolean diaOk = false, mesOk = false, anyoOk = false;

        System.out.print("Introduce una fecha (día mes año separados por espacios): ");
        dia = tec.nextInt();
        mes = tec.nextInt();
        anyo = tec.nextInt();

        if (anyo > 0 && anyo <= 9999) {anyoOk = true;}
        if (mes > 0 && mes <=12) {mesOk = true;}
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 0 && dia <= 30) {
                diaOk = true;
                n = 30;
            }
        } else {
            if (mes == 2 && dia > 0 && dia <= 28) {
            diaOk = true;
            n = 28;
            } else {
                if (dia > 0 && dia <= 31) {
                    diaOk = true;
                    n = 31;
                }
            }
        }
        

        if (diaOk == false || mesOk == false || anyoOk == false) {
            System.out.println(dia + " " + mes + " " + anyo + " es una fecha incorrecta");
            if (diaOk == false){System.out.println("Revise día: " + dia);}
            if (mesOk == false){System.out.println("Revise mes: " + mes);}
            if (anyoOk == false){System.out.println("Revise año: " + anyo);}
        } else {
            //System.out.println("Faltan " + n + " - "+ dia + " = " + (n - dia) + " días hasta final de mes");   
            System.out.println("Faltan " + (n - dia) + " días hasta final de mes");         
        }
    }
}