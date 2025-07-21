import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
   
    public static void main(String[] args) {

        Float nota;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.err.println("Digite sua noata: ");
        nota = scanner.nextFloat();

        if(nota >= 7 && nota <= 10){
            System.out.println("APROVADO");
        }
        else if(nota == 5 || nota == 6){
            System.out.println("Aluno de RECUPERAÇÃO");
        }
        else if(nota > 10 || nota < 0){
            System.out.println("ESSA NOTA NÃO EXISTE");
        }
        else{
            System.out.println("REPROVADO");
        }

        //função ternaria

        // String resultado = nota >= 7 ? "aprovado" : "reprovado";
    }
    
}
