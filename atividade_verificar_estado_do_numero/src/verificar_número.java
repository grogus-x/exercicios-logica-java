import javax.swing.JOptionPane; 
public class verificar_número {
    public static void main(String[] args){
        double numero1;
        numero1=Double.parseDouble(JOptionPane.showInputDialog("Digite um número para ser verificado: "));
        if(numero1 > 0){
            JOptionPane.showMessageDialog(null, "O número " + numero1 + " é positivo" );
            
        }
        else if(numero1 < 0){ 
            JOptionPane.showMessageDialog(null, "O número " + numero1 + " é negativo");
            
        } else{
            JOptionPane.showMessageDialog(null, "O número " + numero1 + " é neutro");
        }
    }
    
}
