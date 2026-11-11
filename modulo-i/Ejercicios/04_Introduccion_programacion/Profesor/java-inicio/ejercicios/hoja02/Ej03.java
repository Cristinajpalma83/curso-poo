import java.util.Scanner;

//De una lista de n números ingresados por teclado, imprimir el mayor
public class Ej03 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);

        int n;
        double num, mayor = 0;
        System.out.print("Ingrese cantidad de valores: ");
        n = tec.nextInt();

        // for (sentencia_inicialización; expr_lógica; sentencia_actualización)
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese valor: ");
            num = tec.nextDouble();
            if (i == 1)
                mayor = num;
                
            if (num > mayor)
                mayor = num;
        }

        System.out.println("El mayor es: " + mayor);
    }
}