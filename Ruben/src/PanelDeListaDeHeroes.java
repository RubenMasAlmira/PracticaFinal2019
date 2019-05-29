import javax.swing.*;
import java.awt.*;

public class PanelDeListaDeHeroes extends JFrame {
    private Usuario usuarioActual;

    PanelDeListaDeHeroes(Usuario usuarioActual) {
        setLayout(new BorderLayout());
        setBounds(20,20,500,500);
        add(new JLabel("Usario: "+usuarioActual.getNombre() + " " + usuarioActual.getApellidos()),BorderLayout.SOUTH);
        add(new PanelBotonesHeroe(usuarioActual));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        Usuario pepe=new Usuario("1234567891","peputo","pedrito garcia","","");
        Heroe ironman=new ConIdentidadSecreta("Ironman",50,"","Tony Stark");
        Heroe zeus=new Dioses("Zeus",100,"Era un tio muy fuerte","Griega","grecia");
        Heroe invisibleman=new Heroe("Invisibleman",30,"Era alguien invisible");
        pepe.getListaDeHeroes().anyadirHeroe(ironman);
        pepe.getListaDeHeroes().anyadirHeroe(zeus);
        pepe.getListaDeHeroes().anyadirHeroe(invisibleman);
        new PanelDeListaDeHeroes(pepe);
    }
}