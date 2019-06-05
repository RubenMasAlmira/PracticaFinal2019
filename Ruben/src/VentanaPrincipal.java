import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    Usuario usuarioActual;
    DialogoUsuario pedirUsuario;
    PanelDeListaDeHeroes panelDelUsuarioAcutal;
    JButton salir = new JButton("Salir");

    VentanaPrincipal() {
            setBounds(0, 0, 500, 600);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            pedirUsuario = new DialogoUsuario();
            usuarioActual = pedirUsuario.getUsuario();
            //salida para ver el usuario actual
            //System.out.println(usuarioActual);
            //
            panelDelUsuarioAcutal = new PanelDeListaDeHeroes(usuarioActual);
            add(panelDelUsuarioAcutal);
            try {
                panelDelUsuarioAcutal = new PanelDeListaDeHeroes(pedirUsuario.getUsuario());
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(null, "No se ha introducido ningún usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
            setVisible(true);

    }




}
