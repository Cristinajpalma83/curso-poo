import java.util.Scanner;

//Solicitar un numero entero positivo por consola e imprimir por pantalla
//  los números naturales hasta el número ingresado inclusive
public class Ej00 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int num, cont = 1;
        System.out.print("Ingrese entero positivo: ");
        num = tec.nextInt();

        while (cont <= num) {
            System.out.println(cont);
            
            cont = cont + 1;
        }

    }
}