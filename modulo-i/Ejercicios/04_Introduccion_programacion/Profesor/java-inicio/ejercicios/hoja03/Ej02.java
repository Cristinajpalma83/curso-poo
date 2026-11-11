import java.util.Scanner;

//Se solicitará al usuario que ingrese números reales para procesar. 
// Luego de ingresar cada número, se le preguntará si quiere ingresar más o no, 
// leyendo la cadena “s” o “n”. Cuando indique que no ingresa más números, 
// Mostrar la cantidad de valores ingresados, el primer valor, el último, el mayor y el menor.
public class Ej02 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        int cont = 0;
        double num, primero, ultimo, mayor, menor;
        primero = ultimo = mayor = menor = 0;
        
        String resp;

        do {
            System.out.print("Ingresa valor: ");
            num = tec.nextDouble();
            tec.nextLine();
            cont++;
            if (cont == 1)
                primero = ultimo = mayor = menor = num;
            
            ultimo = num;
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;

            do {
                System.out.print("Mas valores (s/n): ");
                resp = tec.nextLine();
            } while (!resp.equals("s") && !resp.equals("n"));

        } while(resp.equals("s"));

        System.out.println("Primer valor: " + primero);
        System.out.println("Ultimo valor: " + ultimo);
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
        System.out.println("Cantidad: " + cont);


    }
}