public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);


        smartTv.ligar();
             System.out.println("TV está ligada? "+ smartTv.ligada);
        
        smartTv.desligar();
            System.out.println("TV está ligada? "+ smartTv.ligada);

        smartTv.abaixarVolume();

        smartTv.mudarCanal(233);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.err.println("canal atual = " + smartTv.canal);
        System.err.println(smartTv.volume);

    }
}
