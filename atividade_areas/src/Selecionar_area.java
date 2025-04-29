import javax.swing.JOptionPane;

public class Selecionar_area {
    public static void main(String[] args){
        //Definindo as opcoes
            String[] formas= {"Circulo", "Quadrado", "Triângulo"};
            
            //Exibindo a caixa de dialogo para selecionar a forma
            int escolha = JOptionPane.showOptionDialog(null, "Selecione a area que deseja calcular", "Escolha a forma", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,formas, formas[0]);
            
            //Verificando se o usuário escolheu alguma coisa
            if (escolha != -1 ) {
                // definindo um valor inicial para a area
                double area = 0;
                
                switch (escolha) {
                    //Círculo
                    case 0:
                        String raioStr = JOptionPane.showInputDialog("Digite o valor do raio: ");
                        if (raioStr != null && raioStr.matches("\\d+(\\.\\d+)?")) {
                            double raio = Double.parseDouble(raioStr);
                            area = calcularAreaDoCirculo(raio);
                        } else {
                            JOptionPane.showMessageDialog(null, "Valor inválido");
                            return;
                        }
                        break;
                    // agora a mesma coisa para o quadrado
                    case 1:
                        String ladoStr = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        //Verificando os que foi inserido 
                        if (ladoStr != null && ladoStr.matches("\\d+(\\.\\d+)?")) {
                            double lado = Double.parseDouble(ladoStr);
                            area = calcularAreaDoQuadrado(lado);
                        } else {
                            JOptionPane.showMessageDialog(null, "Valor inválido");
                        }
                        break;
                    //Agora do triangulo
                    case 2:
                        String baseStr = JOptionPane.showInputDialog("Digite o valor da base: ");
                        String alturaStr = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        //Verificando o que foi inserido na base
                        if (baseStr == null || !baseStr.matches("\\d+(\\.\\d+)?")) {
                        JOptionPane.showMessageDialog(null, "Valor da base invalido");
                        return;
                        }    
                        else if (alturaStr == null || !alturaStr.matches("\\d+(\\.\\d+)?")) {
                            JOptionPane.showMessageDialog(null, "Valor da altura inválido");
                            return;
                            } else {
                                double base = Double.parseDouble(baseStr);
                                double altura = Double.parseDouble(alturaStr);
                                area = calcularAreaDoTriangulo(base, altura);
                                break;
                                }
                }
                // Mostrar o resultado final
                JOptionPane.showMessageDialog(null, "A área do "+ formas[escolha] + " " +"é: " + String.format("%.3f", area));
                
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma forma foi selecionada");
            }
    }
    
    //Métodos para calcular as areas
    public static double calcularAreaDoCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
    public static double calcularAreaDoQuadrado(double lado) {
        return lado *lado;
    }
    public static double calcularAreaDoTriangulo(double base, double altura) {
        return (base * altura)/2;
    }
}