import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        numeroUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(numeroUsuario.getText().length() ==9){

                }
            }
        });
    }

    public Long getNumeroUsuario() {
        return Long.parseLong(numeroUsuario.getText());
    }
}
