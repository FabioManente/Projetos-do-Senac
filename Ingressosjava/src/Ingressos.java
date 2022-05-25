import java.util.Scanner;

public class Ingressos {
  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      
      System.out.println("### Programa do Cinema");
      
      System.out.println("Informe o dia da Semana:");
      String a = input.nextLine();
      
      System.out.println("Informe a quantidade de Meias:");
      int b = input.nextInt();
      
      System.out.println("Informea quantidade Inteiras:");
      int c = input.nextInt();
      
      double x = calcularIngressos(a, b, c);
      
      System.out.println("O total e " + x);
  }
      
public static double calcularIngressos(String dia, int inteiras, int meias) {
    double total = 0;
    
    if (dia.equalsIgnoreCase("quarta")) {
        total = (inteiras + meias) * 14.25;
    } else {
        total = (inteiras * 28.5) + (meias * 14.25);
    }
    return total;
}
}