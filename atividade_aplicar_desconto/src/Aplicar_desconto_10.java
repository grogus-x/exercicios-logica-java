import javax.swing.JOptionPane;
public class Aplicar_desconto_10 {
    public static void main(String[] args){
        double valor;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
        
        if(valor > 100){
            double resultado;
            resultado = valor*0.9;
            JOptionPane.showMessageDialog(null, "Parabéns você ganhou 10% de desconto " + resultado);
        }
        else{
            JOptionPane.showMessageDialog(null, "Infelizmente você não é valido para o desconto" + valor);
            }
                                            }
    
}
