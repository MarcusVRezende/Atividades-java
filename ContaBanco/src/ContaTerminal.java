import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();


        System.err.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + " conta " + numero + " e seu Saldo é: " + saldo + " ja está disponivel para saque.");
        System.err.println("Usuario: " + nome);
        System.err.println("Numero de agencia: " + agencia);
        System.err.println("Numero " + numero);
        System.err.println("Saldo atual: " + saldo);


    }
}
