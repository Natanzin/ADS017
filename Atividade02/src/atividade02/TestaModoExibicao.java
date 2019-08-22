
package atividade02;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaModoExibicao extends JFrame{
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setTitle("Janela Principal");
        janelaPrincipal.setSize(640, 480);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
        
        JDialog caixaDialogo = new JDialog(janelaPrincipal, true);
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setTitle("Caixa de Dialogo");
        caixaDialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        caixaDialogo.setVisible(true);
    }
}
