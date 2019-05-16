import java.io.File;

public interface Escribible {
    Escribible escribir(File fichero);
    Escribible leer(File fichero);
}
