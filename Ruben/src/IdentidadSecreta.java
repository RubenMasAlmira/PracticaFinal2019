import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IdentidadSecreta{
    private final String nombreReal;

    IdentidadSecreta(String nombreReal){
        this.nombreReal=nombreReal;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    @Override
    public String toString() {
        return nombreReal;
    }

    public void escribir() {
    }


}
