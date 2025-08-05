import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro numero");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o primeiro numero");
        int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois);

    }

    static void contar(int parametroUm, int parametroDois) {

        int contagem = parametroDois - parametroUm;

        if (parametroUm > parametroDois) {
            System.out.println("segundo numero precisa ser maior que o primeiro");
        } else {
            
            for (int contador = 1; contador <= contagem; contador++) {
                System.err.println("IMPRIMINDO NUMERO: " + contador);
            }
        }
    }

}
