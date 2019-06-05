import javafx.scene.control.Dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DialogoInfoHeroe extends JDialog {


    DialogoInfoHeroe(Heroe heroeActual){
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setBounds(20,50,200,500);
        setLocationRelativeTo(null);
        add(infoAdecuada(heroeActual),BorderLayout.CENTER);
        add(new PanelModificacionYBorrado() {
            @Override
            public ActionListener modificar() {
                return new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new DialogoNuevoHeroe();

                    }
                };
            }

            @Override
            public ActionListener borrar() {
                return null;
            }
        },BorderLayout.SOUTH);
        setVisible(true);


    }

    public JLabel infoAdecuada(Heroe heroeActual) {
        if (heroeActual instanceof ConIdentidadSecreta) {
            return new JLabelInfoConIdentidadSecreta((ConIdentidadSecreta) heroeActual);
        } else if (heroeActual instanceof Dioses) {
            return new JLabelInfoDioses((Dioses) heroeActual);
        } else {
            return new JLabelInfoHeroe(heroeActual);
        }
    }

}
class JLabelInfoHeroe extends JLabel{
    public static final int SEPARACION_LINEAS = 4;

    JLabelInfoHeroe(Heroe heroeActual){
        setLayout(new GridLayout(0,1));
        add(Utilidades.ponerJLabelTitulo("Heroe"));
        add(new JLabel("Nombre Heroico: "+heroeActual.getNombreHeroico()));
        add(new JLabel("Nivel: "+heroeActual.getNivelDePoder()));
        add(new JLabel("Grupo de poder: "+heroeActual.getEstadioDePoder()));
        if(!Utilidades.comprobarVacio(heroeActual.getDescripcion())){
            add(new JLabel("Descripción: "+heroeActual.getDescripcion()));
        }
    }




}

class JLabelInfoDioses extends JLabelInfoHeroe {
    JLabelInfoDioses(Dioses heroeActual) {
        super(heroeActual);
        add(Utilidades.ponerJLabelTitulo("Mitología"));
        add(new JLabel("Nombre: "+heroeActual.getMitologia().getNombre()));
        add(new JLabel("Origen: "+heroeActual.getMitologia().getOrigen()));

    }
}

class JLabelInfoConIdentidadSecreta extends JLabelInfoHeroe {
    JLabelInfoConIdentidadSecreta(ConIdentidadSecreta heroeActual) {
        super(heroeActual);
        add(Utilidades.ponerJLabelTitulo("Identidad Real"));
        add(new JLabel("Nombre Real: "+heroeActual.getIdentidadReal().getNombreReal()));
    }
}

