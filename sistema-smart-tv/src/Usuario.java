public class Usuario {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n");

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
    }
}
