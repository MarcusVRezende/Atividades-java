public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;


    public void mudarCanal (int numeroCanal){
        canal = numeroCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void abaixarCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void abaixarVolume(){
        volume--;
    }
    public void ligar(){
        ligada = true;
    }
     public void desligar(){
        ligada = false;
    }
}
