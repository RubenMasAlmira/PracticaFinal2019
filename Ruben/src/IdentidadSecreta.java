public class IdentidadSecreta {
    private final String nombreReal;

    IdentidadSecreta(String nombreReal){
        this.nombreReal=nombreReal;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    @Override
    public String toString() {
        return "Nombre:"+nombreReal;
    }

}
