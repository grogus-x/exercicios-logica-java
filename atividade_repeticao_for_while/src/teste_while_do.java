import javax.swing.JOptionPane;
public class teste_while_do {
    public static void main(String[] args){
        double nota1, nota2;
        int contador = 1; 
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
            JOptionPane.showMessageDialog(null, "média = " + ((nota1+nota2)/2));
            contador = contador ++; 
        }while (contador <=5);

    }
    
}
