import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ListaDeUsuario implements Escribible,Legible {
    private static File ficheroDeGuardado= new File("usuarios.txt");
    Set<Usuario> usuarios;

    @Override
    public void escribir(File fichero) {
        Iterator<Usuario> iterator=usuarios.iterator();
        while(iterator.hasNext()){
            iterator.next().escribir(ficheroDeGuardado);
        }
    }

    @Override
    public List leer(File fichero) {
        return null;
    }
}
