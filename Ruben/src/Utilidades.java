import javax.swing.*;
import java.awt.*;

public class Utilidades {
    public static boolean comprobarVacio(String datos){
        return "".equals(datos) || datos==null;
    }
    public static JLabel ponerJLabelTitulo(String info){
        JLabel titulo=new JLabel(info);
        Font fuente=new Font("Negrita", Font.BOLD, 20);
        titulo.setFont(fuente);
        return titulo;
    }
}
