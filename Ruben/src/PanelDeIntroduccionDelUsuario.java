import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelDeIntroduccionDelUsuario extends JPanel {
    JTextField usuario=new JTextField(20);
    PanelDeIntroduccionDelUsuario(){
        add(new JLabel("Por favor,introduzca su número de identificación o pase su tarjeta."));
        add(usuario);
        usuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char entrada=e.getKeyChar();
                if(entrada<'0' || entrada>'9'){
                    e.consume();
                }
                if(usuario.getText().length()==9){
                    System.out.println("Has llegado a 9 caracteres");
                    usuario.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyTyped(KeyEvent e) {
                            e.consume();
                        }
                    });
                }

            }
        });
        setLayout(new GridLayout(0,1));
    }
}
