import javax.swing.*;
import java.awt.*;

public class prueba {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Usuario");
        ventana.setLayout(new BorderLayout());
        ventana.add(new PanelDeIntroduccionDelUsuario(),BorderLayout.CENTER);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setBounds(20,20,200,200);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
