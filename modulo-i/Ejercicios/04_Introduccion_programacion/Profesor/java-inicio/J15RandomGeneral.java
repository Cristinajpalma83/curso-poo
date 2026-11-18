import java.util.Scanner;

public class J15RandomGeneral {
    public void main() {
        Scanner tec = new Scanner(System.in);
        int ini, fin, cant;
        
        System.out.print("Desde: ");
        ini = tec.nextInt();
        
        System.out.print("Hasta: ");
        fin = tec.nextInt();

        cant = fin -ini + 1;
        int num;
        
        for (int i = 1; i <= 100; i++) {
            num = (int) Math.floor(Math.random() * cant) + ini;
            System.out.println(num);
        }
    }
}