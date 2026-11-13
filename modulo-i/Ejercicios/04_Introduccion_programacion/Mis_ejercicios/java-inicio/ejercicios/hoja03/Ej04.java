//Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. 
// En cada paso, el programa propone un número y el usuario debe contestar, 
// introduciendo su contestación como dato, si ha acertado, 
// o bien si el número que ha propuesto el ordenador es mayor o es menor que el que tenía pensado. 
// Por ejemplo, ingresando: 
// 0 –> Acierto 
// 1 –> El valor propuesto es mayor 
//-1 –> El valor propuesto es Menor
import java.util.Scanner;
public class Ej04{
    public static void main (String[] arg){
        int n = 50, mayor=100, menor=0, resp = 2;
        String preg1;
        Scanner tec = new Scanner(System.in);
        n = 50;

        System.out.print("Piense un número entre 0 y 100. ¿Lo tiene? (s/n): ");
        preg1 = tec.nextLine();

        if (preg1.equals("s")){
            do {            
                System.out.println(n + " ¿es tu número?");
                System.out.print("Indica si tu número es mayor(-1), menor (1) o si he acertado (0): ");
                resp = tec.nextInt();

                switch (resp) {
                    case -1:                          
                        mayor = n;                      
                        //System.out.println("case -1: " + n + " es n, " + menor + " es menor y " + mayor + " es mayor");
                        break;
                    case 1:   
                        menor = n;                   
                        //System.out.println("case 1: " + n + " es n, " + menor + " es menor y " + mayor + " es mayor");    
                        break;
                    case 0:
                        break;
                }
                n = ((menor + mayor)/2);
            } while (resp != 0);
        }
    }
}