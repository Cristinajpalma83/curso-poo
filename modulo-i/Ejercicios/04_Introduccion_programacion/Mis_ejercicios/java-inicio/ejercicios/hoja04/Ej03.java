//Modifique el programa anterior para que imprima el perímetro del cuadrado de la siguiente manera:
//****
//*  *
//*  *
//****
import java.util.Scanner;
public class Ej03{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int lado;

        System.out.print("Ingrese el lado de un cuadrado: ");
        lado = tec.nextInt();

        for (int i = 1; i <= lado; i++){

                for (int j = 1; j <= lado; j++){

                    if (i == 1 || i == lado){
                        System.out.print("*");  
                    } else {
                        if (j == 1 || j == lado){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }      
                }            
            System.out.println();
        }
    }
}