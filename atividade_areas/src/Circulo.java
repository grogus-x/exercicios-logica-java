import javax.swing.JOptionPane;
public class Circulo {
    public static void main(String[] args){
        //Definindo as variaveis
        double raio, area;
        
        raio=Double.parseDouble(JOptionPane.showInputDialog("Coloque o valor do raio: "));
        
        //Calculando A=pi.r^2
        area= Math.PI * Math.pow(raio, 2);
        
       //Apresentar o resultado
       JOptionPane.showMessageDialog(null, "A area eh: " + area + "u2");
    }
    
}
