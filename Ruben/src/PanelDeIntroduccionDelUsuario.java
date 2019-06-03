import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDeIntroduccionDelUsuario extends JPanel {
    protected JTextField numeroUsuario =new JTextField(20);
    PanelDeIntroduccionDelUsuario(){
        setLayout(new BorderLayout());
        add(new JLabel("Por favor,introduzca su número de identificación o pase su tarjeta."),BorderLayout.NORTH);
        add(numeroUsuario,BorderLayout.SOUTH);
        numeroUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char entrada=e.getKeyChar();
                if(entrada<'0' || entrada>'9'){
                    e.consume();
                }

            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                numeroUsuario.setText(""+numeroUsuario+e.getKeyChar());
            }
        });
    }

    public String getNumeroUsuario() {
        return numeroUsuario.getText();
    }
}
