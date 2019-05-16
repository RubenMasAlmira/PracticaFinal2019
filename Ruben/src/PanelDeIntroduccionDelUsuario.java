import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class PanelDeIntroduccionDelUsuario extends JPanel {
    JTextField usuario = new JTextField(10);
    PanelDeIntroduccionDelUsuario(){
        add(new JLabel("Por favor,introduzca su número de identificación o pase su tarjeta."));
        add(usuario);
        usuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                //super.keyTyped(e);
                System.out.println();
                char entrada=e.getKeyChar();
                if(entrada<'0' || entrada>'9'){
                    e.consume();
                }
            }
        });
        setLayout(new GridLayout(0,1));
    }
}
