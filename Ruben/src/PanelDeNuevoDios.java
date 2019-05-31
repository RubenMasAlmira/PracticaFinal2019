import javax.swing.*;

public class PanelDeNuevoDios extends PanelDeHeroe implements creacionableHeroico{
    JTextField nombreMitologia;
    JTextField origenMitologia;

    PanelDeNuevoDios(){
        super();
        add(Utilidades.ponerJLabelTitulo("Mitología"));
        add(new JLabel());
        add(new JLabel("Nombre:"));
        nombreMitologia=new JTextField();
        add(nombreMitologia);
        add(new JLabel("Origen:"));
        origenMitologia=new JTextField();
        add(origenMitologia);

    }

    @Override
    public Heroe crearHeroe() throws IllegalArgumentException{
        return new Dioses(nombreHeroico.getText(), nivel.getText(), descripcion.getText(), nombreMitologia.getText(), origenMitologia.getText());
    }
}
