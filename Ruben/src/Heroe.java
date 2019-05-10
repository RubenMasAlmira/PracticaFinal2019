import java.util.ArrayList;

public class Heroe extends IdentidadReal {
    private final String nombreHeroico;
    private final TipoDeHeroe tipo;
    private ArrayList<Ataque> ataques;
    private final String descripcion;
    //todo Establecer estadisticas iniciales en funcion del tipo
    private ArrayList<Integer> estadistiasIniciales;

    Heroe(String nombreReal,String lugarDeOrigen,String nombreHeroico,TipoDeHeroe tipo,ArrayList<Ataque> ataques,String descripcion){
        super(nombreReal,lugarDeOrigen);
        this.nombreHeroico=nombreHeroico;
        this.tipo=tipo;
        this.ataques=ataques;
        this.descripcion=descripcion;
    }

    public String getNombreHeroico() {
        return nombreHeroico;
    }

    public TipoDeHeroe getTipo() {
        return tipo;
    }

    //todo Recorrer el array de tal forma que se devuelva un String con los ataques
    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public String getDescripcion() {
        return descripcion;
    }
    //todo Hacer un metodo que de las estadisticas Iniciales
    public ArrayList<Integer> getEstadistiasIniciales() {
        return estadistiasIniciales;
    }
}