import javax.swing.JOptionPane;
public class venda_ticket {
    public static void main(String[] args){
        double valor;
        double quantidade = 30;
        while (quantidade > 0) {
        JOptionPane.showMessageDialog(null, " A quantidade de tickets restante é: " + quantidade);
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade que deseja: "));
            if (valor <= quantidade){
                quantidade = quantidade - valor;
                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso! ");
            }         
             else {
                JOptionPane.showMessageDialog(null, "Quantidade indisponível, tente novamente");
            }
            }
                JOptionPane.showMessageDialog(null, "Sold out!! Todos os tickets foram vendidos");
        }
    }
    
