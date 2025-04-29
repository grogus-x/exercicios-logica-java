import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
    public static void main(String[] args){
        LivroDeNotas livroDeNotas=new LivroDeNotas();
        String nomeDoCurso=JOptionPane.showInputDialog("Prof qual o nome do curso?");
        
        livroDeNotas.exibirMensagem(nomeDoCurso);
    }
    
}
