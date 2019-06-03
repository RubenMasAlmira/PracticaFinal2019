import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    DialogoUsuario pedirUsuario;
    PanelDeListaDeHeroes panelDelUsuarioAcutal;
    JButton salir = new JButton("Salir");
    private Object defaultCloseOperation;

    VentanaPrincipal() {
        setBounds(0, 0, 500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        pedirUsuario = new DialogoUsuario();
        try {
            panelDelUsuarioAcutal = new PanelDeListaDeHeroes(pedirUsuario.getUsuario());
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "No se ha introducido ningún usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
        add(salir, BorderLayout.SOUTH);
    }


}
