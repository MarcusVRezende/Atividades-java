import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String sigla;

        System.err.println("INSIRA A SIGLA DA CAMISETA:");
        sigla = scanner.next();

        switch (sigla){
            case "pp":{
                System.err.println("Baby look");
                break;
            }
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            case "GG":{
                System.out.println("EXTRA GRANDE");
                break;
            }
            default:
            System.err.println("INDEFINIDO");
        }
    }
}