//Calculadora de 4 operaciones. El usuario ingresa dos números y un carácter (+, -, *, / ) 
// y el programa debe mostrar la operación y su resultado. 
// Por ejemplo: 
// Ingrese valor: 12.5 
// Ingrese valor: 2 
// Ingrese operación: - 
// 12.5 – 2 = 10.5
import java.util.Scanner;
public class Ej01{
    public static void main(String[] arg){
        Scanner tec = new Scanner(System.in);
        double n1, n2, r;
        String op;
        n1 = n2 = r = 0.0;

        do {
            System.out.print(
                """
                Ingrese:
                + : para sumar
                - : para restar
                * : para multiplicar
                / : para dividir
                s : para salir
                """);
            op = tec.nextLine();

            if (!op.equals("s")){
                System.out.print("Ingrese primer valor: ");
                n1 = tec.nextDouble();
                System.out.print("Ingrese segundo valor: ");
                n2 = tec.nextDouble();
                tec.nextLine(); //limpiar buffer

                switch (op){
                    case "+" -> r = n1 + n2;
                    case "-" -> r = n1 - n2;
                    case "*" -> r = n1 * n2;
                    case "/" -> r = n1 / n2;
                    default  -> {r = 0;
                        System.out.print("Operación no valida");
                    }
                } 
                System.out.println(n1 + " " + op + " " + n2 + " = " + ((Math.round(r*100))/100.));           
            }                
        } while (!op.equals("s"));       
    }
}