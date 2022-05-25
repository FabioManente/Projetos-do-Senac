import java.util.Scanner;

public class Termometro {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("### Programa do Termometro ");
        
        System.out.println("Informe a temperatura: ");
        double a = input.nextDouble();
        
        boolean x = febre(a);
        
        System.out.println("Esta com febre? " + x);
    }
    
    public static boolean febre(double temperatura) {
        boolean estaFebril = temperatura >= 37;
        return estaFebril;
    }

}


