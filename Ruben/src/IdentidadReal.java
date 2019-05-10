public abstract class IdentidadReal {
    protected final String nombre;
    protected final String lugarDeOrigen;

    IdentidadReal(String nombre,String paisDeOrigen){
        this.nombre=nombre;
        this.lugarDeOrigen=paisDeOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    @Override
    public String toString(){
        return nombre+" "+lugarDeOrigen;
    }

    //todo Debe devolver
    /*public String info(){
    }*/


}
