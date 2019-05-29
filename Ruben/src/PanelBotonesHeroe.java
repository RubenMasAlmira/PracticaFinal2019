import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotonesHeroe extends JPanel {
    public PanelBotonesHeroe(Usuario usuarioActual) {
        setLayout(new GridLayout(0,1));
        for(Heroe h:usuarioActual.getListaDeHeroes().getLista()){
            JButton BotonHeroe=new JButton(h.toString());
            BotonHeroe.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    anyadeDialogoDeHeroe(h);
                }
            });
            add(BotonHeroe);
        }
    }

    private void anyadeDialogoDeHeroe(Heroe heroeActual){
            new DialogoInfoHeroe(heroeActual);
    }
}
