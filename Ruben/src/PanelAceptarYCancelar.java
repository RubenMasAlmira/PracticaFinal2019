import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAceptarYCancelar extends JPanel{
    Heroe nuevoHeroe;
    JButton aceptar=new JButton("Aceptar");
    JButton cancelar=new JButton("Cancelar");
    PanelAceptarYCancelar(DialogoNuevoHeroe dialogo,creacionableHeroico heroe){
        add(cancelar);
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose();
            }
        });
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                nuevoHeroe=heroe.crearHeroe();
                dialogo.dispose();
                }catch (IllegalArgumentException iae){
                    JOptionPane.showMessageDialog(dialogo,iae.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
                //System.out.println(nuevoHeroe);

            }
        });
        add(aceptar);
    }

    public Heroe getNuevoHeroe() {
        return nuevoHeroe;
    }
}
