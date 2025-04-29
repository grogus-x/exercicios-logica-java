import javax.swing.JOptionPane;
public class Calculo_imc {
  public static void main(String[]args){
      //Definindo variaveis
      double peso, altura,imc;
        peso=Double.parseDouble(JOptionPane.showInputDialog("coloque o peso(kg): "));
        altura=Double.parseDouble(JOptionPane.showInputDialog("coloque o altura (m): "));
        //calculo
        imc= peso / Math.pow(altura, 2);
        //condicoes
        if (imc >=25 && imc  <=29.9){
            JOptionPane.showMessageDialog(null,"Seu imc eh de um porco "+ ": " + String.format("%.3f", imc));

        }
        else if (imc>=20 && imc<= 24.9){
            JOptionPane.showMessageDialog(null,"Seu imc esta normal "+ ": " + String.format("%.3f", imc));
        }
        else if (imc<=19) {
            JOptionPane.showMessageDialog(null, "Parece um esqueleto "+ ": " + String.format("%.3f", imc));
            
  }     else {
            JOptionPane.showMessageDialog(null,"Você vai morrer meu camarada, gordo pra kct" + ": "+  String.format("%.3f", imc));
        }
    
}  
}
