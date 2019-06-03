import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelNuevoUsuario extends JPanel{
   private final JTextField nombre=new JTextField();
   private final JTextField apellidos=new JTextField();
    private final JTextField correoElectronico=new JTextField();
    private final PanelDeIntroduccionDeFecha fechaDeNacimiento=new PanelDeIntroduccionDeFecha();


    PanelNuevoUsuario(){
        setBounds(0,0,357,152);
        setLayout(new GridLayout(0,2));
        add(new JLabel("Nombre: "));
        add(nombre);
        add(new JLabel("Apellidos: "));
        add(apellidos);
        add(new JLabel("Correo electronico:"));
        add(correoElectronico);
        add(new JLabel("Fecha de nacimiento (DD/MM/YYYY):"));
        add(fechaDeNacimiento);
    }

    public String getNombre() {
        return nombre.getText().trim();
    }

    public String getApellidos(){
        return apellidos.getText().trim();
    }

    public String getCorreoElectronico() {
        return correoElectronico.getText().trim();
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento.getFecha();
    }

}
class PanelDeIntroduccionDeFecha extends JPanel{
    private JTextField dia=new JTextField();
    private JTextField mes=new JTextField();
    private JTextField anyo=new JTextField();
    PanelDeIntroduccionDeFecha(){
        setLayout(new GridLayout(1,6));
        evitaLetras(dia);
        evitaLetras(mes);
        evitaLetras(anyo);
        add(dia);
        add(new JLabel("/"));
        add(mes);
        add(new JLabel("/"));
        add(anyo);

    }
    public String getFecha(){
        return dia.getText()+"/"+mes.getText()+"/"+anyo.getText();
    }

    private static  void evitaLetras(JTextField textField){
        textField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char entrada=e.getKeyChar();
            if(entrada<'0' || entrada>'9' ){
                e.consume();
            }

        }
        });
    }
}
