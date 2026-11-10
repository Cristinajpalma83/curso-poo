//Solicitando al usuario la cantidad de números a procesar, emitir el siguiente informe: 
/*    Cantidad de nos. Ingresados: xx 
    Sumatoria: xxx 
    Cantidad de nros positivos o 0: xx 
    Cantidad de nros negativos: xx 
    Cantidad de nros pares: xx 
    Cantidad de nros impares: xx 
    Mayor valor: xxx – ingresado en el lugar: xx 
    Menor valor: xxx – ingresado en el lugar: xx 
    Media: xx
*/
import java.util.Scanner;
public class Ej09{
    public static void main (String[] arg){
        int n, nPositivo = 0, nNegativo = 0, nPar = 0, nImpar = 0, pMayor = 0, pMenor = 0;
        double num, mayor = 0, menor = 0, suma = 0;
        Scanner tec = new Scanner(System.in);

        System.out.print("Indique la cantidad de números a introducir: ");
        n = tec.nextInt();

        for (int i=1; i <= n; i++){
            System.out.print("Ingrese número: ");
            num = tec.nextDouble();
            if (i == 1){
                mayor = menor = num;
                }

            //nPositivos
            if (num >= 0) { nPositivo = nPositivo + 1;}
            //nNegativos
            if (num < 0) { nNegativo = nNegativo + 1;}
            //nPar
            if (num % 2 == 0) { nPar = nPar + 1;}
            //nImpar
            if (num % 2 != 0) { nImpar = nImpar + 1;}
            //mayor
            if (num >= mayor) {
                mayor = num;
                pMayor = i;
                }
            //menor
            if (num <= menor) {
                menor = num;
                pMenor = i;
                }
            //suma
            suma = suma + num;            
        }
        System.out.println("Cantidad de nos. Ingresados: " + n);
        System.out.println("Sumatoria: " + suma);
        System.out.println("Cantidad de nros positivos o 0: " + nPositivo);
        System.out.println("Cantidad de nros negativos: " + nNegativo);
        System.out.println("Cantidad de nros pares: " + nPar);
        System.out.println("Cantidad de nros impares: " + nImpar);
        System.out.println("Mayor valor: " + mayor + " – ingresado en el lugar: " + pMayor);
        System.out.println("Menor valor: " + menor + " – ingresado en el lugar: " + pMenor);
        System.out.println("Media: " + suma / n);
    }
}