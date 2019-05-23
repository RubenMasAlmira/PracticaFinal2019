import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ListaDeUsuario implements Escribible,Legible {
    Set<Usuario> usuarios;

    @Override
    public void escribir(File fichero) {
        Iterator<Usuario> iterator=usuarios.iterator();
        while(iterator.hasNext()){
            iterator.next().escribir(fichero);
        }
    }

    @Override
    public List leer(File fichero) {
        return null;
    }
}
