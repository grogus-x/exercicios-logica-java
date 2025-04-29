import javax.swing.JOptionPane;
public class quadrado {
    public static void main(String[] args){
        //Definindo variaveis 
        double lado,area;
        
        lado=Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor da lado: "));
        
        //Calculo da area
        area=Math.pow(lado,2);
        
        //apresentar o resultado
        JOptionPane.showMessageDialog(null, "A area eh: " + area + "u2");
        
    }
}
