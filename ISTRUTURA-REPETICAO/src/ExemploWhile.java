import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while (mesada > 0){
            
            double ValorDoce =  ValorAleatorio();
            
            if(ValorDoce > mesada){
                ValorDoce = mesada;
            }


            System.out.println("doce custa: " + ValorDoce + " Voce tem: " + mesada);

            mesada = mesada - ValorDoce;
        }
        System.err.println( "Mesada =  " + mesada);
        System.err.println("voce gastou toda a sua mesada em doces");
    }

    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(6, 20);
    }
}
