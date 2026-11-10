public class J09Condicional{
    public static void main (String[] arg){
        int num = Integer.parseInt(IO.readln("Ingrese entero: "));

        //Condición simple
        if (num > 0) {
            IO.println(num + " es positivo");
        }

        //condicional doble
        if (num % 2 == 0){
            IO.println(num + " es par");
        }else{
            IO.println(num + " es impar");
        }
    }
}