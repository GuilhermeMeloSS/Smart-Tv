public class Usuario {
    public static void main(String[] args) throws Exception {
SmartTv smartTv = new SmartTv();

System.out.println( "TV ligada? " + smartTv.ligada);
System.out.println("Canal atual? " + smartTv.canal);
System.out.println(" Volume atual? " + smartTv.volume);
    
smartTv.ligar();
System.out.println(" novo status da tv: " + smartTv.ligada);
System.out.println(" novo canal da tv: " + smartTv.canal);
System.out.println(" novo volume da tv: " + smartTv.volume);



smartTv.diminuirVolume();
smartTv.diminuirVolume();
System.out.println(" novo volume da tv: " + smartTv.volume);
smartTv.trocarCanal(13);
System.out.println(" novo canal da tv: " + smartTv.canal);
smartTv.aumentarCanal();
System.out.println(" novo canal da tv: " + smartTv.canal);





}
}
