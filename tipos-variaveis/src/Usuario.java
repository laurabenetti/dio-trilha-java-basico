public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está em qual canal? " + smartTv.canal);
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("A TV está em qual volume? " + smartTv.volume);

        smartTv.mudarCanal(12);

        System.out.println("Novo status -> A TV está em qual canal? " + smartTv.canal);

        smartTv.aumentarCanal();

        System.out.println("Novo status -> A TV está em qual canal? " + smartTv.canal);
        
        smartTv.ligar();

        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("Novo status -> A TV está em qual volume? " + smartTv.volume);

        smartTv.diminuirVolume();

        System.out.println("Novo status -> A TV está em qual volume? " + smartTv.volume);
    }
}
