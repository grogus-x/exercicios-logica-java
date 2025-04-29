import javax.swing.JOptionPane;
//chat
public class PedirUmaTabuadav2 {
    public static void main(String[] args) {
        double tabuada = Double.parseDouble(JOptionPane.showInputDialog("Selecione a tabuada: "));
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Selecione até qual número deseja calcular: "));

        // String para armazenar os resultados
        StringBuilder resultado = new StringBuilder("Tabuada do " + (int) tabuada + "até o"+ numero +":\n");

        // For encadeado
        for (double i = tabuada; i <= tabuada; i++) {
            for (int j = 1; j <= numero; j++) {  
                resultado.append((int) i).append(" X ").append(j).append(" = ").append((int) (i * j)).append("\n");
            }
        }

        // Exibe todos os resultados de uma vez
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
