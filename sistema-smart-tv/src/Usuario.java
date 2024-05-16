public class Usuario {
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirrVolume();
        smartTV.diminuirrVolume();
        smartTV.diminuirrVolume();
        smartTV.aumentarVolume();


        System.out.println("Canal atual : " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal atual : " + smartTV.canal);

        System.out.println("Volume atual : " + smartTV.volume);



        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println("Canal atual : " + smartTV.canal);
        System.out.println("Volume atual : " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTV.ligada);

    }
    
}
