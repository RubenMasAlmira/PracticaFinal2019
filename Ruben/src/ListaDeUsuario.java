import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ListaDeUsuario{

    private static File ficheroDeGuardadoUsuarios= new File("usuarios.txt");
    Set<Usuario> usuarios=new HashSet<>();

    public void anyadirUsuario(Usuario nuevoUsuario){
        if(usuarios.contains(nuevoUsuario)){
            throw new IllegalArgumentException("Error,no se pueden introducir dos usuarios iguales");
        }
        usuarios.add(nuevoUsuario);
    }

    public void eliminarUsuario(Usuario usuario){
        if(!usuarios.contains(usuario)){
            throw new IllegalArgumentException("El usuario no existe");
        }
        usuarios.remove(usuario);
    }

    public boolean estaElUsuario(Usuario usuario){
        return usuarios.contains(usuario);
    }

    public void escribir() {
        Iterator<Usuario> iterator=usuarios.iterator();
        while(iterator.hasNext()){
            iterator.next().escribir(ficheroDeGuardadoUsuarios);
        }
    }


    public void leer() {
        try {
            List<String> lineas=Files.readAllLines(ficheroDeGuardadoUsuarios.toPath());
            Iterator<String> iterator=lineas.iterator();
            String[] lineasDelUsuarioAcutual=new String[Usuario.LINEAS_DE_LECTURA];
            while(iterator.hasNext()) {
                for (int i = 0; i < Usuario.LINEAS_DE_LECTURA; i++) {
                    lineasDelUsuarioAcutual[i] = iterator.next();
                }
                usuarios.add(new Usuario(lineasDelUsuarioAcutual[0], lineasDelUsuarioAcutual[1], lineasDelUsuarioAcutual[2], lineasDelUsuarioAcutual[3], lineasDelUsuarioAcutual[4], lineasDelUsuarioAcutual[5],lineasDelUsuarioAcutual[0]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
