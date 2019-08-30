
import javax.swing.JOptionPane;

/**
 * @author 18214290005
 */
public class TestaMensagemBoasVindas {
    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar a festa?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            String nome = JOptionPane.showInputDialog(null, "Diga seu nome:");
            if (nome.equals("")) {
                JOptionPane.showMessageDialog(null, "Tu não disse teu nome ser humano.", "Erro", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Bem-vindo " + nome, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
