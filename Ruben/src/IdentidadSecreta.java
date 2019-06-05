import java.io.Serializable;

public class IdentidadSecreta implements Serializable {
    private final String nombreReal;

    IdentidadSecreta(String nombreReal){
        if(Utilidades.comprobarVacio(nombreReal)){
            throw new IllegalArgumentException("El nombre de la identidad real no puede estar vacio.");
        }
        this.nombreReal=nombreReal;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    @Override
    public String toString() {
        return nombreReal;
    }


}
