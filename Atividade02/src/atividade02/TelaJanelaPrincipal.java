
package atividade02;

import javax.swing.JFrame;

public class TelaJanelaPrincipal extends JFrame{

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setVisible(true);
        janela.setSize(640, 480);
        janela.setTitle("Janela Principal");
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
