//Escribir un programa que imprima por pantalla todas las fichas de dominó, de una por línea y sin repetir.
// 0 : 0 
// 0 : 1 
public class Ej13{
    public static void main (String[] arg){
        for (int i = 0; i <= 6; i++){
            for (int j = i; j <= 6; j++){
                System.out.println(i + " : " + j);
            }
        }
    }
}