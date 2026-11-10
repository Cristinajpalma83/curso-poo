import java.util.Scanner;

public class E01SumaNumeros {
    public static void main (String[] arg){
        //Definir num1, num2, resu como Entero
        int num1;
        int num2; 
        int resu;        
        Scanner tec = new Scanner(System.in); // Definimos tec como tipo Scanner para leer la cadena que el usuario escribe por teclado
        //Escribir "Ingrese primer valor"
        System.out.print("Ingrese el primer número entero: ");
        //Leer num1
        num1 = tec.nextInt();
        //Escribir "Ingrese segundo valor"
        System.out.print("Ingrese el segundo número entero: ");
        //Leer num2        
        num2 = tec.nextInt();

        // Sumar num1 y num2
        resu = num1 + num2;

        //Escribir "El resultado es: " , resu
        System.out.print("El resultado es: " + resu);
        
    }
}