import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ListaDeUsuario {
    Set<Usuario> usuarios;

    ListaDeUsuario(File documentoDeLectura){
        usuarios=new HashSet<>();

        try{
            List lineas=Files.readAllLines(Paths.get(""));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
