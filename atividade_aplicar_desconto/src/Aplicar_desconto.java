import javax.swing.JOptionPane; 
public class Aplicar_desconto {
    public static void main(String[] args){
        double valor1, desconto, valorf;
        valor1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da compra"));
        desconto=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto (0-100%)"));
        
        valorf = valor1 * (1 - (desconto /100));
        
        JOptionPane.showMessageDialog(null, "O valor final da compra é de: " + valorf + "R$ com " + desconto + "% de deconto");
    }
    
}
