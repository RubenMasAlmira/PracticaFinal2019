import javax.swing.*;
import java.awt.*;

public class PanelNuevoUsuario extends PanelDeIntroduccionDelUsuario{
   private final JLabel nombreYApellido=new JLabel();
    private final JLabel correoElectronico=new JLabel();

    PanelNuevoUsuario(){
        setLayout(new GridLayout(0,2));
        add(new JLabel("Nombre completo:"));
        add(nombreYApellido);
        add(correoElectronico);
    }

    /*public Usuario getUsuario(){
        return new Usuario(getNumeroUsuario(),nombreYApellido.getText().substring(0,nombreYApellido.getText().indexOf(' ')),nombreYApellido.getText().substring(nombreYApellido.getText().indexOf(' ')),correoElectronico.getText());
    }*/

}
