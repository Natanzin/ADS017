
package atividade09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Janela extends JFrame{
    private JMenuBar barraMenu;
    private JMenu menuArquivo;
    private JMenu menuAjuda;
    private JMenuItem menuArquivoSair;
    private JMenuItem menuAjudaSobre;

    public Janela() {
        this.barraMenu = new JMenuBar();
        this.menuArquivo = new JMenu();
        this.menuArquivo.setText("Arquivo");
        this.menuArquivo.setMnemonic('A');
        this.menuAjuda = new JMenu();
        this.menuAjuda.setText("Ajuda");
        this.menuAjuda.setMnemonic('j');
        this.menuArquivoSair = new JMenuItem();
        menuArquivoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.menuArquivoSair.setText("Sair");
        this.menuArquivoSair.setMnemonic('r');
        this.menuAjudaSobre = new JMenuItem();
        menuAjudaSobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Aplicação 1.0");
            }
        });
        this.menuAjudaSobre.setText("Sobre");
        this.menuAjudaSobre.setMnemonic('S');
        
        this.barraMenu.add(menuArquivo);
        this.barraMenu.add(menuAjuda);
        this.menuAjuda.add(menuAjudaSobre);
        this.menuArquivo.add(menuArquivoSair);
        
        setJMenuBar(barraMenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
        
    }
        
}
