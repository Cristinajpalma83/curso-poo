//Escribir un programa que imprima las tablas del 1 al 9.
public class Ej11{
    public static void main (String[] arg){
        int n;

        for (int i = 1; i <= 9;i++){
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}