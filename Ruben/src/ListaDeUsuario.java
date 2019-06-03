import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ListaDeUsuario {

    private static File ficheroDeGuardadoUsuarios = new File("usuarios.txt");
    private Map<String, Usuario> usuarios = new HashMap<>();

    {
        if (ficheroDeGuardadoUsuarios.exists()) {
            this.leer();
        }
    }

    public Usuario elegirUsuario(String numeroDeIdentificacion) {
        if (estaElUsuario(numeroDeIdentificacion)) {
            return usuarios.get(numeroDeIdentificacion);
        }
        return null;
    }

    public void anyadirUsuario(Usuario nuevoUsuario) {
        usuarios.put(nuevoUsuario.getIndentificacionDeUsuario(), nuevoUsuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        if (!usuarios.containsKey(usuario.getIndentificacionDeUsuario())) {
            throw new IllegalArgumentException("El usuario no existe");
        }
        usuarios.remove(usuario);
    }

    public boolean estaElUsuario(String numerodeUsuario) {
        return usuarios.containsKey(numerodeUsuario);
    }

    public void escribir() {
        try (FileWriter fw = new FileWriter(ficheroDeGuardadoUsuarios)) {
            Iterator<String> iterator = usuarios.keySet().iterator();
            while (iterator.hasNext()) {
                fw.write(usuarios.get(iterator.next()).stringDeEscritura());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }

    public void leer() {
        try {
            List<String> lineas = Files.readAllLines(ficheroDeGuardadoUsuarios.toPath());
            Iterator<String> iterator = lineas.iterator();
            String[] lineasDelUsuarioAcutual = new String[Usuario.LINEAS_DE_LECTURA];
            while (iterator.hasNext()) {
                for (int i = 0; i < Usuario.LINEAS_DE_LECTURA; i++) {
                    lineasDelUsuarioAcutual[i] = iterator.next();
                }

                usuarios.put(lineasDelUsuarioAcutual[0],
                        new Usuario(lineasDelUsuarioAcutual[0],
                                lineasDelUsuarioAcutual[1],
                                lineasDelUsuarioAcutual[2],
                                lineasDelUsuarioAcutual[3],
                                lineasDelUsuarioAcutual[4],
                                lineasDelUsuarioAcutual[5],
                                lineasDelUsuarioAcutual[0]));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
