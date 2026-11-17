//Solicitar una fecha (día, mes, año) 
// y validar si es una fecha correcta sin contemplar años bisiestos, es decir, no se puede ingresar 29 2 xxxx.
import java.util.Scanner;
public class Ej11{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int dia, mes, anyo;
        boolean diaOk = false, mesOk = false, anyoOk = false;

        System.out.print("Introduce una fecha (día mes año separados por espacios): ");
        dia = tec.nextInt();
        mes = tec.nextInt();
        anyo = tec.nextInt();

        if (anyo > 0 && anyo <= 9999) {anyoOk = true;}
        if (mes > 0 && mes <=12) {mesOk = true;}
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 0 && dia <= 30) {diaOk = true;}
        } else {
            if (dia > 0 && dia <= 31) {diaOk = true;}
        }
        if (mes == 2 && dia > 0 && dia <= 28) {diaOk = true;}

        if (diaOk == false || mesOk == false || anyoOk == false) {
            System.out.println(dia + " " + mes + " " + anyo + " es una fecha incorrecta");
            if (diaOk == false){System.out.println("Revise día: " + dia);}
            if (mesOk == false){System.out.println("Revise mes: " + mes);}
            if (anyoOk == false){System.out.println("Revise año: " + anyo);}
        } else {
            System.out.println(dia + " " + mes + " " + anyo + " es una fecha correcta");            
        }
    }
}