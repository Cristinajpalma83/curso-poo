//Dados un número indefinido de notas obtenidas por alumnos en sus exámenes, 
// mostrar por pantalla la mayor y la menor nota obtenida del grupo. 
// (Cuando el usuario ingrese -1 finaliza la carga)
import java.util.Scanner;
public class Ej01{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        double nota, mayor = 0, menor = 0;

        System.out.print("Ingrese nota: ");
        nota = tec.nextDouble();
        if (nota > 0){
            mayor = menor = nota;
        }

        while (nota >= 0){
            
            if (nota > mayor){mayor = nota;}
            if (nota < menor){menor = nota;}

            System.out.print("Ingrese nota: ");
            nota = tec.nextDouble();
        }
        System.out.println("La mayor nota del grupo es: " + mayor + " y la menor nota del grupo es: " + menor);
    }
}