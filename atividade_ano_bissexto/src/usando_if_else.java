//entendendo o que fazer com if else

import javax.swing.JOptionPane;
public class usando_if_else {
    public static void main(String[] args) {
        int ano;
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano"));
//              resto    and                 or
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            JOptionPane.showMessageDialog(null, ano + ": É um ano bissexto");
        } else {
            JOptionPane.showMessageDialog(null, ano + ": Não é um ano bissexto");
        }
    }
}
