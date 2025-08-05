public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        analisarCanidato(2000.0);
        analisarCanidato(2200.0);
        analisarCanidato(1900.0);

    }
    static void selecaoCandidatos(){

        String[] candidatos  = { "FELIPE", "MARCIS", "PAULO", "MONICA", "CEBOLINHA", "CASCAO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5) {
            String candidato = ca
            
        }
    }
    static void analisarCanidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}
