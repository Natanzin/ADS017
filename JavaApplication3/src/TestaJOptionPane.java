
import javax.swing.JOptionPane;

/**
 * @author 18214290005
 */
public class TestaJOptionPane {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null, "Informe um valor:");
      
        JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);
        
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
        
        JOptionPane.showMessageDialog(null, "O Victor estará dormindo das 11hs a 16hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Atenção! Faltou aquela informação secreta que você nos prometeu.", "Alerta", JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Viiiish! Alberto sacaneou o time.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
