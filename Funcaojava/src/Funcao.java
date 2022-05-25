import java.util.Scanner;

public class Funcao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("### Programa da Contagem:");
        
        System.out.println("Informe um numero limite:");
        int a = input.nextInt();
        
        contarAte(a);
}

private static void contarAte(int a) {
	for (int volta = 1; volta <= a; volta++) {
        System.out.println(volta);
    }
		
	}
    
}