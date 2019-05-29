import javax.swing.*;
import java.awt.*;

public class DialogoNuevoHeroe extends JDialog {
    Heroe heroeNuevo;
    DialogoNuevoHeroe(){
        setModal(true);
        setBounds(20,20,500,200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JComboBox tipoHeroe=new JComboBox<Heroe>();
        add(tipoHeroe);


        setVisible(true);
    }



    public Heroe getHeroe() {
        return heroeNuevo;
    }


}
