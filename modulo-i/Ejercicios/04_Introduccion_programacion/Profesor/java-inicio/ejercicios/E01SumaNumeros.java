import java.util.Scanner;
//Donde digo Scanner quiero decir java.util.Scanner

public class E01SumaNumeros {
    public static void main(String[] arg) {
        Scanner tec = new Scanner(System.in);
        double num1, num2, resu;

        System.out.print("Ingresa valor 1: ");
        num1 = tec.nextDouble();
        System.out.print("Ingresa valor 2: ");
        num2 = tec.nextDouble();

        resu = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + resu);
    }
}
