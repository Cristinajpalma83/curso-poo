//Realizar el juego “Adivina número”. 
// El ordenador debe generar un número “secreto” aleatorio con las siguientes características:
//  - Debe tener 4 dígitos diferentes
//  - No puede comenzar en 0 
// El usuario debe adivinarlo, para ello irá ingresando números de 4 cifras 
// y el programa le indicará la cantidad de dígitos correctos y la cantidad de dígitos regulares. 
// Un dígito es correcto cuando está en la posición que le corresponde y es regular si está en el número secreto, pero en otra posición.
import java.util.Scanner;
public class Ej16{
    public static void main (String[] arg){
        Scanner tec = new Scanner(System.in);
        int r1, r2, r3, r4, r, x; 
        int random, ini = 0, fin = 9, cant;
        int n, digito;
        int cont = 0, bueno = 0, regular = 0;
        boolean acierto = false;

        // Calcular dígito a dígito el número random. Ojo, los 4 dígitos tienen que ser distintos        
            cant = fin - ini + 1; 
            r1 = r2 = r3 = r4 = (int) Math.floor(Math.random() * cant) + ini;            

            while (r1 == r2){
                r2 = (int) Math.floor(Math.random() * cant) + ini;
                while (r2 == r3 || r1 == r3){
                    r3 = (int) Math.floor(Math.random() * cant) + ini;
                    while (r3 == r4 || r2 == r4 || r1 == r4){
                        r4 = (int) Math.floor(Math.random() * cant) + ini;
                    }
                }
            }
            x = random = r1 * 1000 + r2 * 100 + r3 * 10 + r4;
            System.out.println(random);        
            

        while (acierto != true) {
            // Pedir al usuario su número
            System.out.print("Introduca un número de 4 cifras: ");
            n = tec.nextInt();


            //Recorremos n dígito a dígito
            for (int i = 1; i <= 4; i++){  
                digito = n % 10;
                
                n = n / 10; //descuento dígito para la siguiente vuelta              
                //Comparar dígito a dígito con el número random
                x = random;

                for (int j = 1; j <= 4; j++){ 
                    r = x % 10;                  
                   
                   if (digito == r && i == j) {
                        bueno++;
                    }
                    if (digito == r && i != j){
                        regular++;
                    }

                    x = x / 10; 
                }                

                if (bueno == 4) { acierto = true;}                
                cont++;                
            }
            

            if (acierto == true){
                System.out.println("Has acertado!!! en " +  cont/4 + " intentos");
            } else {
                System.out.println(bueno + " buenos y " + regular + " regulares");
                //reinicio variables para la siguiente comprobación n vs random
                bueno = 0;
                regular = 0;
            }
        }
        
        
    }
}