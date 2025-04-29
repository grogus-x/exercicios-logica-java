
public class Personagem {
    //definindo as variaveis do boneco
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    
    void cacar(){
        if (energia >= 2){
        System.out.println(nome+" cacando");
        energia -=2;
    } else {
        System.out.println(nome + " Está sem energia no momento");
        System.exit(energia);
    }
        fome=Math.min(fome+1,10);
        sono=Math.min(sono+1,10);
    }    
    void comer(){
        if (fome >= 1 ){
        System.out.println(nome+" comendo");
        energia=Math.min(energia+1,10);
        fome-=1;
        }    
    }
    void dormir(){
        if (sono >=1){
        System.out.println(nome+" dormindo");
        sono-=1;
        energia=energia+1<=10?energia+1:10;
    }else{
            System.out.println(nome + " Está sem sono");
        }
    }    
}
