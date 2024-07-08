import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o primeiro nome!");
        String primeiroNome = scanner.next();

        System.out.println("Por favor, digite o sobrenome!");
        String segundoNome = scanner.next();

        System.out.println("Por favor, digite o Saldo!");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + primeiroNome.concat(" " + segundoNome) + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponivel para saque");

     }
}
