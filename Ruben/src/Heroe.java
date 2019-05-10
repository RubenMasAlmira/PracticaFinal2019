import java.util.ArrayList;

public class Heroe {
    private final String nombreHeroico;
    private final String descripcion;

    Heroe(String nombreHeroico,String descripcion){
        this.nombreHeroico=nombreHeroico;
        this.descripcion=descripcion;
    }

    public String getNombreHeroico() {
        return nombreHeroico;
    }


}