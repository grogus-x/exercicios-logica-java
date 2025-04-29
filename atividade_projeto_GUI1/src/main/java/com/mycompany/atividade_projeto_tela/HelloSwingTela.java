
package com.mycompany.atividade_projeto_tela;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwingTela {
    public static void criarTela(){
        JFrame tela = new JFrame("Hello, Swing!!!");
        // essa opção ativa o funcionalidade do X, para fechar o app
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //constroi um JLabel
        JLabel helloSwingLabel = new JLabel("Hello, Swing!!!!!!!");
        //obtem o painel de conteúdo
        Container painelDeConteudo = tela.getContentPane();
        //adiciona o JLabel ao painel de conteúdo
        painelDeConteudo.add(helloSwingLabel);
        //ajusta largura e altura da tela conforme seu conteúdo
        tela.pack();
        //torna a tela visível normalmente as telas vem desativadas, prcisa ser true
        tela.setVisible(true);

    }
    
}
