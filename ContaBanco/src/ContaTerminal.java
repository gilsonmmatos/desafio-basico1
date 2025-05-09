import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero da conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite a agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite o valor do seu primeiro deposito");
        double saldo = scanner.nextDouble();
       
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " +conta+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
