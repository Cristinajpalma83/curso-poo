import java.util.Scanner;

//Dados un número indefinido de notas obtenidas por alumnos en sus exámenes,
// mostrar por pantalla la mayor y la menor nota obtenida del grupo. 
// (Cuando el usuario ingrese -1 finaliza la carga)
public class Ej01 {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double nota, mayor, menor;

        System.out.print("Ingrese nota: ");
        mayor = menor = nota = tec.nextDouble();

        while(nota >= 0) {
            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;

            System.out.print("Ingrese nota: ");
            nota = tec.nextDouble();
        }
        if (mayor >= 0) {
            System.out.println("Nota mayor: " + mayor);
            System.out.println("Nota menor: " + menor);
        }
    }
}