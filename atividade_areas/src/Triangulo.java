import javax.swing.JOptionPane;
public class Triangulo {
    public static void main(String[] args){
        //definindo as variaveis
        double base,alt,area;
        
        base=Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor da base: "));
        alt=Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor da altura: "));
        
        //Calculo da area
        area=(base*alt);
        
        //Apressentar o resultado
        JOptionPane.showMessageDialog(null, "A area eh : " +area + "u2");
        
    }
    
}
