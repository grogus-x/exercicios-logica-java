
public class Piloto {
    private String nome;
    private int horasVoo;
    
    public Piloto(String nome){
        this.nome= nome;
        this.horasVoo = 0;
    }
    
    public String getnome(){
        return nome;
    }    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void adicionarHoras(int horas){
        this.horasVoo += horas;
    }
     public void imprime(){        
        System.out.println("O piloto " + nome+ " tem: "+ horasVoo + " Horas de voo");
        if (horasVoo <= 200){
            System.out.println("Cargo: Co-piloto");
        } else {
            System.out.println("Cargo: Comandante");
        }
        System.out.println("---------------------------------------------------");
    }
    
}
