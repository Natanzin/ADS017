
package atividade02;

import javax.swing.JDialog;

public class TestaCaixaDialogo extends JDialog{
    public static void main(String[] args) {
        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setVisible(true);
        caixaDialogo.setTitle("Caixa de diálogo");
        caixaDialogo.setSize(320, 240);
        caixaDialogo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
    
}
