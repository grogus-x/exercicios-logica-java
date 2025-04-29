
public class jogo {
    public static void main(String[] args)throws InterruptedException{
        Personagem cacador = new Personagem();
        Personagem soneca = new Personagem();
        cacador.nome="Enzo ";
        soneca.nome="Leonardo";
        while(true){
        cacador.cacar();
        soneca.dormir();
        cacador.comer();
        soneca.dormir();
        cacador.dormir();
        soneca.dormir();
        cacador.cacar();
        soneca.comer();
        cacador.cacar();
        soneca.dormir();
        cacador.cacar();
        soneca.cacar();
        cacador.cacar();
        System.out.println("==================");
        Thread.sleep(2000);
    }
    }    
}
