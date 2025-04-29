import java.util.Scanner;
public class ForEncadeado{
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int tabuada;
        System.out.println("Até qual tabuada você quer? ");
        tabuada = entrada.nextInt();
        for (int i= 1; i <= tabuada; i++){
            
            System.out.println("Tabuada do " + i+":");
            
            for (int j = 1; j<=10; j++) {
                
            System.out.println(i + " X " + j + " = " + (i*j));
            }
        }
            
                                    }   
            
                                           }
        
    
    

