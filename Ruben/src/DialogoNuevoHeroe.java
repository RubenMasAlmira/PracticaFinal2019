import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DialogoNuevoHeroe extends JDialog {
    JComboBox tipoHeroe=new JComboBox<String>();
    JPanel panelDeHeroeActual;
    PanelAceptarYCancelar aceptarYCancelar;

    DialogoNuevoHeroe(){
        setModal(true);
        setBounds(20,20,600,300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        tipoHeroe.addItem("Heroe Normal");
        tipoHeroe.addItem("Heroe con identidad secreta");
        tipoHeroe.addItem("Dios");

        setTitle("Nuevo "+tipoHeroe.getSelectedItem());
        cambiaTipoDePanelDeHeroeActual((String)tipoHeroe.getSelectedItem());
        add(panelDeHeroeActual,BorderLayout.CENTER);

        //todo Hacer que te deje cambiar entre todas las opciones libremente
        //todo Solucionar el error relacionado a que no se puedan crear Heroes de forma normal
        tipoHeroe.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                setTitle("Nuevo "+tipoHeroe.getSelectedItem());
                remove(panelDeHeroeActual);
                cambiaTipoDePanelDeHeroeActual((String)tipoHeroe.getSelectedItem());
                add(panelDeHeroeActual,BorderLayout.CENTER);
                setVisible(false);
                setVisible(true);
            }
        });
        add(tipoHeroe,BorderLayout.NORTH);



        aceptarYCancelar=new PanelAceptarYCancelar(this,(creacionableHeroico) panelDeHeroeActual);
        add(aceptarYCancelar,BorderLayout.SOUTH);
        setVisible(true);
    }


    private JPanel cambiaTipoDePanelDeHeroeActual(String tipoHeroe){
        if("Heroe Normal".toUpperCase().equals(tipoHeroe.toUpperCase())){
            return panelDeHeroeActual=new PanelDeHeroe();
        }else if("Heroe con identidad secreta".toUpperCase().equals(tipoHeroe.toUpperCase())){
            return panelDeHeroeActual=new PanelDeNuevoHeroeConIdentidadSecreta();
        }else{
            return panelDeHeroeActual=new PanelDeNuevoDios();
        }
    }

    public Heroe getHeroe() {
        return aceptarYCancelar.getNuevoHeroe();
    }

/*
                */
}
