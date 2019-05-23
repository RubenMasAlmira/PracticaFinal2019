import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListaDeHeroes implements Escribible,Legible{
    private final Set<Heroe> listaHeroes;

    ListaDeHeroes(){
        listaHeroes=new TreeSet<>();
    }

    @Override
    public void escribir(File fichero) {

    }

    @Override
    public List leer(File fichero) {
        return null;
    }
}
