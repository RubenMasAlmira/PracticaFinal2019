import javafx.scene.control.ComboBox;
import javax.swing.*;
import java.awt.*;

public class DialogoNuevoHeroe extends JDialog {
    Heroe heroeNuevo;
    DialogoNuevoHeroe(){
        setLayout(new BorderLayout());
        ComboBox tipoHeroe=new ComboBox<Heroe>();
        add(tipoHeroe,BorderLayout.NORTH);

    }



    public Heroe getHeroe() {
        return heroeNuevo;
    }


}
