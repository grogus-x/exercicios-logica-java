import javax.swing.JOptionPane;
public class if1 {
    public static void main(String[]args) {
        //declarando as variaveis 
        double num1;
        
        //pedindo os números
        num1=Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor : ")); 
        
        //definindo a condicao 
        if(num1>=70){
                   JOptionPane.showMessageDialog(null, "Aprovado");                              
        } else {
               JOptionPane.showMessageDialog(null, "Reprovado");            
        
    }
        
        
    }
    
}
