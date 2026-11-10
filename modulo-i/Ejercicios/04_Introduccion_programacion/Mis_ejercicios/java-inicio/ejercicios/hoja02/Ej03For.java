//De una lista de n números ingresados por teclado, imprimir el mayor.
import java.util.Scanner;
public class Ej03{
    public static void main (String[] arg){
        int cant;
        double num, mayor = 0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Indique cuantos números va a ingresar: ");
        cant = tec.nextInt();

//for (sentencia_inicializacion; expresion_logica; sentencia_actualización)
        for (int i = 1; i <= cant; i++) {
            System.out.print("Ingrese número: ");
            num = tec.nextInt();

            if (i == 1){
                mayor = num;
            }

            if (num > mayor){
                mayor = num;
            }
        }
        System.out.println(mayor + " es el mayor");
    }
}