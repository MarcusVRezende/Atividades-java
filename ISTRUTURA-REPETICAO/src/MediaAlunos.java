import java.util.Locale;
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String[] alunos = {"Marcus", "Miguel", "Juan", "lol", "dav"};
    
        int media = calculaMedia(alunos, scan);

        System.err.println("A media da truma é " + media);
    }

    public static int calculaMedia(String[] alunos, Scanner scanner){
        int soma = 0;
        for(String aluno : alunos){
            System.err.println("digite a nota de " + alunos);

            int nota = scanner.nextInt();
            soma += nota;
        }
        
        return soma / alunos.length;

    }
}
