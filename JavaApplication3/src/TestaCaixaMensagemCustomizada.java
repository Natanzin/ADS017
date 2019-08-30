
import javax.swing.JOptionPane;

/**
 * @author 18214290005
 */
public class TestaCaixaMensagemCustomizada {
    public static void main(String[] args) {
        String[] opcoes = {"Java", ".Net", "Php"};
        int opcao;
        
        opcao = JOptionPane.showOptionDialog(null, "Qual tua linguagem preferida?", "Enquete", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
    }
}
