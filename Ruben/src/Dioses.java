import java.util.Objects;

public class Dioses extends Heroe {
    private final Mitologia mitologia;
    Dioses(String nombreHeroico, int nivelDePoder, String descripcion,Mitologia mitologia) {
        super(nombreHeroico, nivelDePoder, descripcion);
        this.mitologia=mitologia;
    }

    Dioses(String nombreHeroico, int nivelDePoder, String descripcion,String nombreMitologia,String origen) {
        this(nombreHeroico,nivelDePoder,descripcion,new Mitologia(nombreMitologia,origen));
    }

    public Mitologia getMitologia() {
        return mitologia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dioses dioses = (Dioses) o;
        return Objects.equals(mitologia, dioses.mitologia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mitologia);
    }

    @Override
    public String toString() {
        return super.toString();

    }

}
