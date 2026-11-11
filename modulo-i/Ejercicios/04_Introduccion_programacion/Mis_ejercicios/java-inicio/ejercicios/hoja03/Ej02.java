//Se solicitará al usuario que ingrese números reales para procesar. 
// Luego de ingresar cada número, se le preguntará si quiere ingresar más o no, leyendo la cadena “s” o “n”. 
// Cuando indique que no ingresa más números, 
// Mostrar la cantidad de valores ingresados, el primer valor, el último, el mayor y el menor.

import java.util.Scanner;
public class Ej02{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        double n, cant = 0, ni, mayor, menor;
        String r;

        System.out.print("Ingrese un número real: ");
        ni = n = mayor = menor = tec.nextDouble();
        tec.nextLine(); //limpia el buffer
        cant++; 
        
        do{                       
            System.out.print("¿Quiere ingresar más números? (s/n): ");
            r = tec.nextLine();
        } while (!r.equals("s") && !r.equals("n"));
        
        while (r.equals("s")) {
            System.out.print("Ingrese un número real: ");
            n = tec.nextDouble();
            tec.nextLine(); //limpia el buffer <-- el salto de linea que dejó el nextInt o nextDouble
            cant++;
            if (n > mayor){mayor = n;}
            if (menor < n){menor = n;}

            System.out.print("¿Quiere ingresar más números? (s/n): ");
            r = tec.nextLine();
        }
        System.out.println("Cantidad de valores ingresados es: " + cant);
        System.out.println("Primer valor es: " + ni);
        System.out.println("Último valor es: " + n);
        System.out.println("El mayor valor es:" + mayor);
        System.out.println("El menor valor es: " + menor);
    }
}