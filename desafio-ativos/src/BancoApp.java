import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat ("#####,##");
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        
        taxaJuros = 1 + taxaJuros;
        
       valorFinal = valorInicial * Math.pow(taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$"+ df.format(valorFinal));
        
        scanner.close();
    }
}