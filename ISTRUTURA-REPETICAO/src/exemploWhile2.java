import java.util.Locale;
import java.util.Scanner;

public class exemploWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        int digito;

        System.out.println("Digite o DIGITO secreto");
        digito = scanner.nextInt();

        while(digito != 3){
            System.err.println("digito ERRADO, tente novamente: ");
            
            digito = scanner.nextInt();

        }
        System.err.println("VOCÊ ACERTOU, BARABÊNS!!!");
    
    }
}