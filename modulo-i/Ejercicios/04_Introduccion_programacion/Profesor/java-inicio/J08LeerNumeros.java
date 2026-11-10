import java.util.Scanner;

public class J08LeerNumeros {
    public void main() {
        //java 25
        int num = Integer.parseInt(IO.readln("Ingresa entero: "));
        double otro = Double.parseDouble(IO.readln("Ingresa real: "));

        double otroMas = Double.parseDouble("3.1415925");

        //java de toda la vida
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese entero: ");
        int unoNuevo = tec.nextInt();

        IO.println(num);
        IO.println(otro);
        IO.println(otroMas);
        IO.println(unoNuevo);
    }
}