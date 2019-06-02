import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoUsuario extends JDialog {
    Usuario usuarioActual;
    private PanelDeIntroduccionDelUsuario panelIntroduccionUsuario =new PanelDeIntroduccionDelUsuario();
    private PanelNuevoUsuario panelNuevoUsuario;
    private PanelAceptarYCancelar aceptarYCancelarUsuario= new PanelAceptarYCancelar() {
        @Override
        public ActionListener aceptar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(numeroDeIdentificacionValido(panelIntroduccionUsuario.getNumeroUsuario()) && !listaDeUsuario.estaElUsuario(panelIntroduccionUsuario.getNumeroUsuario()) && !"".equals(panelIntroduccionUsuario.getNumeroUsuario())){
                        remove(panelIntroduccionUsuario);
                        setTitle("Nuevo Usuario");
                        panelNuevoUsuario=new PanelNuevoUsuario(panelIntroduccionUsuario.getNumeroUsuario());
                        add(panelNuevoUsuario, BorderLayout.CENTER);
                        setVisible(false);
                        setVisible(true);
                    }

                }
            };
        }

        @Override
        public ActionListener cancelar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            };
        }
    };
    private ListaDeUsuario listaDeUsuario=new ListaDeUsuario();
    DialogoUsuario(){
        setModal(true);
        setTitle("Usuario");
        setLayout(new BorderLayout());
        setBounds(0,0,400,125);
        add(panelIntroduccionUsuario,BorderLayout.CENTER);
        add(aceptarYCancelarUsuario,BorderLayout.SOUTH);

        setModal(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    private static boolean numeroDeIdentificacionValido(String numeroDeValidacion){
        return numeroDeValidacion.length()==Usuario.CANTIDAD_DE_NUMEROS_IDENTIFICACION;
    }

    public Usuario getUsuario() {
        return usuarioActual;
    }

    public static void main(String[] args) {
        new DialogoUsuario();
    }
}
