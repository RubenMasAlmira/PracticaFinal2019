import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDeListaDeHeroes extends JPanel{

    private JButton anyadir;
    private PanelBotonesHeroe heroes;
    DialogoNuevoHeroe nuevoHeroe;


    PanelDeListaDeHeroes(Usuario usuarioActual) {
        setLayout(new BorderLayout());
        setBounds(20,20,500,500);
        add(new JLabel("Usario: "+usuarioActual.getNombre() + " " + usuarioActual.getApellidos()),BorderLayout.SOUTH);
        add(heroes=new PanelBotonesHeroe(usuarioActual),BorderLayout.CENTER);

        anyadir=new JButton("Añadir nuevo Heroe");
        anyadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevoHeroe=new DialogoNuevoHeroe();
                try{
                    if(nuevoHeroe.getHeroe()==null){
                        JOptionPane.showMessageDialog(null,"No se ha añadido ningún heroe","Atención",JOptionPane.WARNING_MESSAGE);
                    }else{
                    usuarioActual.getListaDeHeroes().anyadirHeroe(nuevoHeroe.getHeroe());
                    usuarioActual.getListaDeHeroes().escribir();
                    setVisible(false);
                    PanelDeListaDeHeroes.this.remove(heroes);
                    heroes=new PanelBotonesHeroe(usuarioActual);
                    add(heroes,BorderLayout.CENTER);
                    setVisible(true);
                    }
                }catch (NullPointerException npe){
                    System.out.println("No se añade ningún heroe");
                }

            }
        });
        add(anyadir,BorderLayout.NORTH);
        setVisible(true);
    }
}