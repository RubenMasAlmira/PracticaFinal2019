import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDeListaDeHeroes extends JFrame {
    private JButton anyadir;
    private PanelBotonesHeroe heroes;


    PanelDeListaDeHeroes(Usuario usuarioActual) {
        setLayout(new BorderLayout());
        setBounds(20,20,500,500);
        add(new JLabel("Usario: "+usuarioActual.getNombre() + " " + usuarioActual.getApellidos()),BorderLayout.SOUTH);
        add(heroes=new PanelBotonesHeroe(usuarioActual),BorderLayout.CENTER);

        anyadir=new JButton("Añadir nuevo Heroe");
        anyadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogoNuevoHeroe nuevoHeroe=new DialogoNuevoHeroe();
                try{
                    usuarioActual.getListaDeHeroes().anyadirHeroe(nuevoHeroe.getHeroe());
                    setVisible(false);
                    PanelDeListaDeHeroes.this.remove(heroes);
                    heroes=new PanelBotonesHeroe(usuarioActual);
                    add(heroes,BorderLayout.CENTER);
                    setVisible(true);
                }catch (NullPointerException npe){
                    System.out.println("No se añade ningún heroe");
                }

            }
        });
        add(anyadir,BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}