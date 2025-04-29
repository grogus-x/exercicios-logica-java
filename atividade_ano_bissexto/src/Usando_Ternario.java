// usando ternario
import javax.swing.JOptionPane;

public class Usando_Ternario {
    public static void main(String[] args){
        int ano;
        //cirando a variavel booleana
        boolean bissexto;
        ano = Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano"));

        //fazendo o ternario ( if e else gourmet)
        bissexto = (ano % 4 == 0 && ano % 100 != 0) || ( ano % 400 == 0);
        
        // criando uma string para mostrar o texto segundo a resposta booleana com o valor ternario
        String mensagem = bissexto
        //se for true = ? 
        ? ano + " é um ano bissexto"
        // se for false :
        : ano + " não é um ano bissexto";
        // mostrar a mensagem na caixa de dialogo
        JOptionPane.showMessageDialog(null, mensagem);




    }


}
/* se eu não quiser mostrar a menssagem o resto o codigo pode ficar assim
import javax.swing.JOptionPane;

public class ano {
    public static void main(String[] args){
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)

        JOptionPane.showMessageDialog(null, bissexto);
    }
}

*/
