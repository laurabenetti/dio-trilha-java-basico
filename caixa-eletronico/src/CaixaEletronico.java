import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 20.0;
        System.out.println("Seu saldo atual é de: " +saldo);

        System.out.println("Qual o valor a ser sacado? ");
        double valorsolicitado = scanner.nextDouble(); 

        if (valorsolicitado < saldo) {
            
            saldo = saldo - valorsolicitado;

            System.out.println("Seu saldo atual é de: " +saldo);

        } else {

            System.out.println("Saldo insuficiente.");
            
        }
    }
}
