
package com.mycompany.atividade_projeto_tela;

import static com.mycompany.atividade_projeto_tela.HelloSwingTela.criarTela;
import javax.swing.SwingUtilities;

public class Atividade_projeto_tela {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}
