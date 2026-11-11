import java.util.Scanner;

//Imprimir la suma de n números ingresados por teclado. 
//  La cantidad de números (n) se solicita al usuario al principio y se ingresa por teclado

public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int cont = 1, n;
        double num, suma = 0;
        System.out.print("Ingrese cantidad de datos a procesar: ");
        n = tec.nextInt();

        while (cont <= n){
            System.out.print("Ingrese valor: ");
            num = tec.nextDouble();
            // suma = suma + num;
            suma += num;

            cont++;
        }
        System.out.println("Sumatorio: " + suma);
    }
}