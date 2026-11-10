public class J05LeerCadenaV25 {
    public static void main(String[] arg) {
        String nombre;  //Declaro la variable nombre de tipo String
        IO.print("Ingresa tu nombre: ");
        nombre = IO.readln(); //Lee desde el teclado una cadena y la guarda en nombre
        IO.println("Hola " + nombre + " bienvenido!!");
    }
}