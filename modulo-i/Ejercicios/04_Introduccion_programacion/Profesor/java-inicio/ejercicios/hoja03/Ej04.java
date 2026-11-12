import java.util.Scanner;

//Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. 
// En cada paso, el programa propone un número y el usuario debe contestar, 
// introduciendo su contestación como dato, si ha acertado, o bien si el número que 
// ha propuesto el ordenador es mayor o es menor que el que tenía pensado. 
// Por ejemplo, 
// ingresando: 
// 0 –> Acierto 
// 1 –> El valor propuesto es mayor 
// -1 –> El valor propuesto es Menor

public class Ej04 {
    public void main() {
        Scanner tec = new Scanner(System.in);
        int i = 0, d = 100, cont = 0;
        int intento, resp;

        System.out.println("Piensa un número entre " + i + " y " + d);
        System.out.println(
            """
            0 –> Acierto
            1 –> El valor propuesto es mayor
            -1 –> El valor propuesto es Menor
            """
        );

        do {
            intento = (i + d) / 2;
            System.out.print("Es el " + intento + "?");
            resp = tec.nextInt();
            cont++;

            if (resp == 1)
                d = intento;
            if (resp == -1)
                i = intento;
        } while(resp != 0 && i < d);

        System.out.println("\nHe acertado en " + cont + " intentos.");
    }
}