import javax.swing.*;
import java.awt.*;

public class prueba {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Usuario");
        ventana.setLayout(new BorderLayout());
        ventana.add(new PanelDeIntroduccionDelUsuario(),BorderLayout.CENTER);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setBounds(200,200,20,20);
        ventana.setVisible(true);
    }
}
