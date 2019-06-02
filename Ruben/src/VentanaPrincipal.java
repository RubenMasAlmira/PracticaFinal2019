import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    DialogoUsuario pedirUsuario;
    PanelDeListaDeHeroes panelDelUsuarioAcutal;
    JButton salir=new JButton("Salir");

    VentanaPrincipal(){
        setBounds(0,0,500,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        pedirUsuario=new DialogoUsuario();
        panelDelUsuarioAcutal=new PanelDeListaDeHeroes(pedirUsuario.getUsuario());
    }


}
