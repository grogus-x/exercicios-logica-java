import javax.swing.JOptionPane;
public class fatorial_com_while {
    public static void main(String[] args){
        double valor;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        double fatorial = valor; 
        while (valor >1) {
            fatorial = fatorial*(valor-1);
            valor--;
        }
        JOptionPane.showMessageDialog(null, " O valor é = " + fatorial);

    }
}

             