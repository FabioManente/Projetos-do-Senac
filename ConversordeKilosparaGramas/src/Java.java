import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("### Programa da Conversao de Kilos para Gramas ");
        
        System.out.println("Informe o valor do kilo: ");
        int a = input.nextInt();
        
        int x = kilosparaGramas(a);
        
        System.out.println("A qtd em gramas e " + x);
    }
       
    public static int kilosparaGramas(int numero){
        int gramas = numero * 1000;
        return gramas;
    }
}