import javax.swing.JOptionPane;

public class EntradaStrException extends Exception {
    public void validarInpStr() {
        JOptionPane.showMessageDialog(
            null,
            "Erro: digite algo no campo antes de enviar",
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
    }
}
