import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDeHeroe extends JPanel implements creacionableHeroico{
    protected JTextField nombreHeroico;
    protected JTextField nivel;
    protected JTextArea descripcion;


    PanelDeHeroe(){
        setLayout(new GridLayout(0,2));
        nombreHeroico=new JTextField();
        nivel=new JTextField();
        descripcion=new JTextArea(10,10);
        add(Utilidades.ponerJLabelTitulo("Heroe"));
        add(new JLabel());
        add(new JLabel("Nombre heroico:"));
        add( nombreHeroico);
        add(new JLabel("Nivel:"));
        add( nivel);
        add(new JLabel("Descripción:"));
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        add(descripcion);
        setVisible(true);

    }

    PanelDeHeroe(Heroe heroe){
        nivel=new JTextField(heroe.getNivelDePoder());
        descripcion=new JTextArea(10,50);
        nombreHeroico=new JTextField(heroe.getNombreHeroico());
    }

    @Override
    public Heroe crearHeroe() throws IllegalArgumentException{
        return new Heroe(nombreHeroico.getText(),nivel.getText(), descripcion.getText());
    }

}
