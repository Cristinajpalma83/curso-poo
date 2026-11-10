//De una lista de n números ingresados por teclado, imprimir el mayor.
import java.util.Scanner;
public class Ej03{
    public static void main (String[] arg){
        int n, num, cont=1, mayor=0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Indique cuantos números va a ingresar: ");
        n = tec.nextInt();

        while (cont <= n) {            
            System.out.print("Ingrese número: ");
            num = tec.nextInt();
            if (cont == 1){
                mayor = num;
            }
            
            if (num > mayor){
                mayor = num;
            }
            cont++;
        }
        System.out.println(mayor + " es el mayor");
    }
}