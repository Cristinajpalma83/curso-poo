public class J06TiposDato{
    public static void main(String[] arg) {
        char c = 'x'; //char permite guardar un carácter. Un literal con comilla simple.
        String s = "hola que tal"; //String = cadena
        int num = 345; // int nuemeros enteros positivo
        double real = 3.14; //double numeros reales, con decimales
        boolean condicion = true; //Booleano con valores true/false
        condicion = false;

        IO.println(c);
        IO.println(s);
        IO.println(num);
        IO.println(real);
        IO.println(condicion);
    }
}