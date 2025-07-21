public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 23.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.err.println(saldo);
        }
        else{
            System.err.println(saldo);
        }
    }
    
}
