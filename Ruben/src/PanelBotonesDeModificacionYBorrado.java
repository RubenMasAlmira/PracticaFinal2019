import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotonesDeModificacionYBorrado extends JPanel implements BorraYModifica{

    @Override
    public ActionListener borrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    @Override
    public ActionListener modificar() {
        return null;
    }
}
