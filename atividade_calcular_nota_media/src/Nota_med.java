import javax.swing.JOptionPane;
public class Nota_med {
    public static void main(String[] args) {
        double nota1, nota2, nota3, x;

        // estrutura do for for ( inicio, fim, ) ou seja ele vai se repetir a qtd de vezes até chegar no fim
        for (int i= 1; i <= 3; i++){
        nota1=Double.parseDouble(JOptionPane.showInputDialog("coloque a nota1:"));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("coloque a nota2"));
        nota3=Double.parseDouble(JOptionPane.showInputDialog("coloque a nota3:"));
        x = ((nota1+nota2+nota3)/3);
        if (x >= 7) {
        JOptionPane.showMessageDialog(null,"Sua média é:"+" " + x +" " +"Você foi aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Você foi reprovado" + ": " + "sua média é"+" "+ x);
        }              
            
        }
        
        
    }
    
}
