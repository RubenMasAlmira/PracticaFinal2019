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



    public static void main(String[] args) {
        Usuario pepe=new Usuario("1234567891","peputo","pedrito garcia","","");
        Heroe ironman=new ConIdentidadSecreta("Ironman","50","","Tony Stark");
        Heroe zeus=new Dioses("Zeus","100","Era un tio muy fuerte","Griega","grecia");
        Heroe invisibleman=new Heroe("Invisibleman","30","Era alguien invisible");
        pepe.getListaDeHeroes().anyadirHeroe(ironman);
        pepe.getListaDeHeroes().anyadirHeroe(zeus);
        pepe.getListaDeHeroes().anyadirHeroe(invisibleman);
        new PanelDeListaDeHeroes(pepe);
    }
}