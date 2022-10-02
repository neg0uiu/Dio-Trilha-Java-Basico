public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal padrão: " + smartTv.canal);
        System.out.println("Volume padrão: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Aumentar canal - Novo Status - Canal atual: " + smartTv.canal);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status - Volume atual: " + smartTv.volume);

        smartTv.buscarCanal(12);
        System.out.println("Bucar canal - Novo Status - Canal atual: " + smartTv.canal);

    }
}
