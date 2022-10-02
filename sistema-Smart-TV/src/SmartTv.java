public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void buscarCanal (int novoCanal){
        canal = novoCanal;
    }
    public int aumentarCanal(){
        return ++canal;
    }
    public int diminuirCanal(){
        return --canal;
    }

    public int aumentarVolume(){
        System.out.println("aumentando volume para: " + volume);
        return ++volume;
    }
    public int diminuirVolume(){
        return --volume;
    }
    
}
