import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class ConIdentidadSecreta extends Heroe {
    private final IdentidadSecreta identidadReal;

    ConIdentidadSecreta(String nombreHeroico, String nivelDePoder, String descripcion,IdentidadSecreta identidad) {
        super(nombreHeroico, nivelDePoder, descripcion);
        this.identidadReal=identidad;
    }

    ConIdentidadSecreta(String nombreHeroico,String nivelDePoder, String descripcion,String nombre) {
        this(nombreHeroico,nivelDePoder,descripcion,new IdentidadSecreta(nombre));
    }

    public IdentidadSecreta getIdentidadReal() {
        return identidadReal;
    }

    @Override
    public String toString() {
        return identidadReal.toString()+"-\n"+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConIdentidadSecreta that = (ConIdentidadSecreta) o;
        return Objects.equals(identidadReal, that.identidadReal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), identidadReal);
    }


}
