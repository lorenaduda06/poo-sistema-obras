import javax.swing.JOptionPane;

public class ValorMinException extends Exception {
    public void validarInpNum() {
        JOptionPane.showMessageDialog(
            null,
            "Erro: o valor deve ser maior que 0",
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
    }
}
