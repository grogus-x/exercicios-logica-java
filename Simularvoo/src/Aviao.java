
public class Aviao {
    private int horasTotal;
    private int horasDaUltimaRevisao;
    
    public Aviao(){
        this.horasTotal = 0;
        this.horasDaUltimaRevisao = 0;
        
    }
    public void fazVoo(int horas, Piloto piloto){
        if(horasDaUltimaRevisao + horas > 200){
            System.out.println("O aviao precisa de manutencao antes de voar + " + horas+ " horas");
            return;
        } 
        
    
        this.horasTotal += horas;
        this.horasDaUltimaRevisao += horas;
        piloto.adicionarHoras(horas);
        System.out.println("Voo realizado por "+ piloto.getnome()+" com a duracao de "+horas+ " horas");
    }
    public void fazRevisao(){
        System.out.println("Fazendo a revisao do aviao");
        this.horasDaUltimaRevisao = 0;
        
    }
    public void imprime(){
        System.out.println("Horas acumuladas do aviao: " +horasTotal);
        System.out.println("Horas ate a proxima revisao "+ (200 - horasDaUltimaRevisao));
        if(horasDaUltimaRevisao>=200){
            System.out.println("O aviao precisa de revisao");
        } else{
            System.out.println("O aviao esta pronto para voar");
        }
        System.out.println("---------------------------------------------------");
    }
        }
    
