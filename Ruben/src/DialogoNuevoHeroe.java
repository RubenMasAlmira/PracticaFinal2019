import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DialogoNuevoHeroe extends JDialog {
    Heroe nuevoHeroe;
    JComboBox tipoHeroe=new JComboBox<String>();
    creacionableHeroico panelDeHeroeActual;
    PanelAceptarYCancelar aceptarYCancelar=new PanelAceptarYCancelar() {
        @Override
        public ActionListener aceptar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        nuevoHeroe =panelDeHeroeActual.crearHeroe();
                        System.out.println(nuevoHeroe);
                        dispose();
                    } catch (IllegalArgumentException iae) {
                        JOptionPane.showMessageDialog(null, iae.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            };
        }

        @Override
        public ActionListener cancelar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nuevoHeroe=null;
                    System.out.println("ejecutadoCancelar");
                    dispose();
                }
            };
        }
    };

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
        add((JPanel)panelDeHeroeActual,BorderLayout.CENTER);

        //todo Hacer que te deje cambiar entre todas las opciones libremente
        tipoHeroe.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                setTitle("Nuevo "+tipoHeroe.getSelectedItem());
                remove((JPanel)panelDeHeroeActual);
                cambiaTipoDePanelDeHeroeActual((String)tipoHeroe.getSelectedItem());
                add((JPanel)panelDeHeroeActual,BorderLayout.CENTER);
                setVisible(false);
                setVisible(true);
            }
        });
        add(tipoHeroe,BorderLayout.NORTH);



        add(aceptarYCancelar,BorderLayout.SOUTH);
        setVisible(true);
    }


    private creacionableHeroico cambiaTipoDePanelDeHeroeActual(String tipoHeroe){
        if("Heroe Normal".toUpperCase().equals(tipoHeroe.toUpperCase())){
            return panelDeHeroeActual=new PanelDeHeroe();
        }else if("Heroe con identidad secreta".toUpperCase().equals(tipoHeroe.toUpperCase())){
            return panelDeHeroeActual=new PanelDeNuevoHeroeConIdentidadSecreta();
        }else{
            return panelDeHeroeActual=new PanelDeNuevoDios();
        }
    }

    public Heroe getHeroe() {
        return nuevoHeroe;
    }

}
