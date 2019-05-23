import javax.swing.*;
import java.awt.*;

public class DialogoUsuario extends JDialog {
    private PanelDeIntroduccionDelUsuario panelUsuario=new PanelDeIntroduccionDelUsuario();
    private Button aceptar=new Button("Aceptar");
    DialogoUsuario(){
        setTitle("Usuario");
        setLayout(new BorderLayout());
        setBounds(0,0,400,125);
        setResizable(false);
        add(panelUsuario,BorderLayout.CENTER);
        add(aceptar,BorderLayout.SOUTH);
        setModal(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
