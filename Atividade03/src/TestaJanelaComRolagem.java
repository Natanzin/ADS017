
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author 18214290005
 */
public class TestaJanelaComRolagem {
    public static void main(String[] args) {
        JPanel painelComum = new JPanel();
        painelComum.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        painelComum.setPreferredSize(new Dimension(800, 600));
        
        JScrollPane painelRolagem = new JScrollPane();
        painelRolagem.setViewportView(painelComum);
        
        JFrame janela = new JFrame();
        janela.add(painelRolagem);
        janela.setSize(640, 480);
        janela.setTitle("Janela com paineis!");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
