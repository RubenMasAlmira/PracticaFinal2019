import javax.swing.*;

public class PanelDeNuevoHeroeConIdentidadSecreta extends PanelDeHeroe implements creacionableHeroico {
    JTextField nombreReal;

    PanelDeNuevoHeroeConIdentidadSecreta() {
        super();
        add(Utilidades.ponerJLabelTitulo("Identidad Real"));
        add(new JLabel());
        add(new JLabel("Nombre:"));
        nombreReal = new JTextField();
        add(nombreReal);
    }

    @Override
    public Heroe crearHeroe() throws IllegalArgumentException{
        return new ConIdentidadSecreta(nombreHeroico.getText(), nivel.getText(), descripcion.getText(), nombreReal.getText());
    }
}
