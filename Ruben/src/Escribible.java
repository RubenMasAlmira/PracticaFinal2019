import java.io.File;
import java.io.IOException;

public interface Escribible {
    String stringDeEscritura();
    void escribir(File fichero) throws IOException;

}
