import javax.swing.JOptionPane;
public class condic1 {
    public static void main(String[] args) {
        //Declarando variaveis
        double num1, num2;
        
        //pedindo numeros
        num1=Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor : "));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor : "));
        
        //mostrando numeros
        JOptionPane.showMessageDialog(null, "A soma eh : " +(num1+num2));
        
        
        
    }
    
}
