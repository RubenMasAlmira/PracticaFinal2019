public class IdentidadReal {
    protected final String nombre;
    protected final String lugarDeOrigen;
    protected int edad;

    IdentidadReal(String nombre,String paisDeOrigen,int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.lugarDeOrigen=paisDeOrigen;
    }

    public String getNombre() {
        return nombre;
    }

}
