import java.util.Objects;

public class Mitologia {
    private final String nombre;
    private final String origen;

    public Mitologia(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
        if(Utilidades.comprobarVacio(nombre)) {
            throw new IllegalArgumentException("El nombre de la mitología no puede estar vacio");
        }else if(Utilidades.comprobarVacio(origen)){
            throw new IllegalArgumentException("El origen de la mitología no puede estar vacio");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }


    @Override
    public String toString(){
        return nombre+"-"+origen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mitologia mitologia = (Mitologia) o;
        return Objects.equals(nombre, mitologia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }


}
