import java.util.Scanner;
public class PedirUmaTabuada {
    public static void main(String[] args) { 
        Scanner entrada=new Scanner(System.in);
        int tabuada , numero;
        System.out.print("Selecione a tabuada:  ");
        tabuada = entrada.nextInt();
        System.out.print("Selecione até qual número quer calcular:  ");
        numero = entrada.nextInt();  
        for (int i= tabuada; i <=tabuada; i++){       
            
            for (int j = 1; j<=numero; j++) {
                
            System.out.println(i + " X " + j + " = " + (i*j));
            }
        }
            
                                    }   
            
                                           }
        