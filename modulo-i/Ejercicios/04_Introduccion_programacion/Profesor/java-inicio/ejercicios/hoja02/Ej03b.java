import java.util.Scanner;

//De una lista de n números ingresados por teclado, imprimir el mayor
public class Ej03b {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int n;
        double num, mayor = 0;
        System.out.print("Ingrese cantidad de valores: ");
        n = tec.nextInt();
        
        if (n > 0) {
            System.out.print("Ingrese valor: ");
            mayor = tec.nextDouble();
        }

        // for (sentencia_inicialización; expr_lógica; sentencia_actualización)
        for (int i = 2; i <= n; i++) {
            System.out.print("Ingrese valor: ");
            num = tec.nextDouble();
            if (num > mayor)
                mayor = num;
        }

        System.out.println("El mayor es: " + mayor);
    }
}