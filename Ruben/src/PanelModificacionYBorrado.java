import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class PanelModificacionYBorrado extends JPanel{
    private JButton modificar=new JButton("Modificar");
    private JButton borrar=new JButton("borrar");

    PanelModificacionYBorrado(){
        setLayout(new GridLayout(1,2));
        add(modificar);
        modificar.addActionListener(modificar());
        add(borrar);
        borrar.addActionListener(borrar());
    }

    public abstract ActionListener modificar();
    public abstract ActionListener borrar();
}
