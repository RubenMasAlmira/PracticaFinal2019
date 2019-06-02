import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelNuevoUsuario extends JPanel{
   private final JTextField nombreYApellido=new JTextField();
    private final JTextField correoElectronico=new JTextField();
    private final JTextField fechaDeNacimiento=new JTextField();
    private Usuario usuarioNuevo;


    PanelNuevoUsuario(String numeroUsuario){
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
        return usuarioNuevo;
    }

}
