import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotonesHeroe extends JPanel {
    Usuario usuarioActual;
    public PanelBotonesHeroe(Usuario usuarioActual) {
        setLayout(new GridLayout(0,1));
        try {
            for (Heroe h : usuarioActual.getListaDeHeroes().getLista()) {
                JButton BotonHeroe = new JButton(h.toString());
                BotonHeroe.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        anyadeDialogoDeHeroe(h);
                    }
                });
                add(BotonHeroe);
            }
        }catch (NullPointerException npe){
            JOptionPane.showMessageDialog(null,"No se ha añadido ningún heroe","Atención",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void anyadeDialogoDeHeroe(Heroe heroeActual){
            new DialogoInfoHeroe(heroeActual);
    }

    private boolean listaVacia(){
        return usuarioActual!=null && usuarioActual.getListaDeHeroes().getLista().size()==0;
    }
}
