public class J10Switch{
    public static void main (String[] arg){
        int valor = 2;
        switch(valor) {
            case 1: 
                System.out.println ("Uno");                
            case 2: 
                System.out.println ("Dos");
            case 3: 
                System.out.println ("Tres");
            case 4: 
                System.out.println ("Cuatro");
                break;
            case 5: 
                System.out.println ("Cinco");
            default: //opcional en la estructura del Switch de java
                System.out.println ("Otro valor");
        }
        //aquí viene el break
    }
}