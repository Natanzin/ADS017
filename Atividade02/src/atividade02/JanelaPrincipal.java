package atividade02;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame {

    private JanelaSobre janelaSobre;

    public JanelaPrincipal() {
        super();
        janelaSobre = new JanelaSobre(this, true);
    }

    public void exibir() {
        setSize(640, 480);
        setTitle("Aplicação GUI");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        janelaSobre.exibir();

    }
}
