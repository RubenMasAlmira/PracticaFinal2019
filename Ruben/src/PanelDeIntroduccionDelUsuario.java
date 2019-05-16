import javax.swing.*;
import java.awt.*;

public class PanelDeIntroduccionDelUsuario extends JPanel {
    JTextField usuario=new JTextField(20);
    PanelDeIntroduccionDelUsuario(){
        add(new JLabel("Por favor,introduzca su número de identificación o pase su tarjeta."));
        add(usuario);
        setLayout(new GridLayout(0,1));
    }
}
