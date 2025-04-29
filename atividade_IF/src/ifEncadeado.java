import javax.swing.JOptionPane;
public class ifEncadeado {
    public static void main(String[]args){
        double nota;
        nota=Double.parseDouble(JOptionPane.showInputDialog("coloque a nota:"));
        if(nota>=90){
            JOptionPane.showMessageDialog(null, "Prabéns");
            JOptionPane.showMessageDialog(null,"Conceito A");
            
        }
        else if (nota >=80){
            JOptionPane.showMessageDialog(null, "Conceito B");
            
        }
        else if (nota>=70){
            JOptionPane.showMessageDialog(null, "Conceito C");
        }
        else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
    
}
