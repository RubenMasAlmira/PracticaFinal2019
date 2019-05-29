import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelNuevoUsuario extends PanelDeIntroduccionDelUsuario{
   private final JLabel nombreYApellido=new JLabel();
    private final JLabel correoElectronico=new JLabel();
    private final JLabel fechaDeNacimiento=new JLabel();


    PanelNuevoUsuario(){
        setLayout(new GridLayout(0,2));
        add(new JLabel("Nombre completo:"));
        add(nombreYApellido);
        add(new JLabel("Correo electronico:"));
        add(correoElectronico);
        add(new JLabel("Fecha de nacimiento:"));
        add(fechaDeNacimiento);

        fechaDeNacimiento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char entrada=e.getKeyChar();
                if(entrada<'0' || entrada>'9' || !"/".equals(entrada)){
                    e.consume();
                }

            }
        });
    }

    public Usuario getUsuario(){
        return new Usuario(getNumeroUsuario(),
                nombreYApellido.getText().substring(0,nombreYApellido.getText().indexOf(' ')),
                nombreYApellido.getText().substring(nombreYApellido.getText().indexOf(' ')),
                correoElectronico.getText(),
                fechaDeNacimiento.getText());
    }

}
