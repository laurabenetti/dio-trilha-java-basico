import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        
        public static void main(String[] args) throws Exception {
            
            try (Scanner scanner = new Scanner (System.in).useLocale(Locale.US)) {

                System.out.println("Qual é o seu nome? ");
                String nome = scanner.nextLine();

                System.out.println("Qual é o número da sua agência? ");
                String agencia = scanner.nextLine();
                
                System.out.println("Qual é o número da sua conta? ");
                int conta = scanner.nextInt(); 

                System.out.println("Qual é o seu saldo? ");
                double saldo = scanner.nextDouble();

                System.out.println("Olá " +nome+ ", obrigada por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +conta+ " e seu saldo " +saldo+ " já está disponível para saque.");
            }

        }
    }
