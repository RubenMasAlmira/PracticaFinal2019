import javafx.scene.control.ComboBox;
import javax.swing.*;
import java.awt.*;

public class DialogoNuevoHeroe extends JDialog {
    Heroe heroeNuevo;
    DialogoNuevoHeroe(){
        setLayout(new BorderLayout());
        ComboBox tipoHeroe=new ComboBox<Heroe>();
        add(tipoHeroe);

    }



    public Heroe getHeroe() {
        return heroeNuevo;
    }


}
