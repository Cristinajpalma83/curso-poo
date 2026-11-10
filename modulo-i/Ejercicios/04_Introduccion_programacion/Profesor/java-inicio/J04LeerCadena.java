import java.util.Scanner;

public class J04LeerCadena {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        String nombre;  //Declaro la variable nombre de tipo String
        System.out.print("Ingresa tu nombre: ");
        nombre = tec.nextLine(); //Lee desde el teclado una cadena y la guarda en nombre
        System.out.println("Hola " + nombre + " bienvenido!!");
    }
}