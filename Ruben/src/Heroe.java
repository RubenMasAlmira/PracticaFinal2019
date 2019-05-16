import java.util.Objects;

public class Heroe {
    protected final String nombreHeroico;
    protected int nivelDePoder;
    protected final String descripcion;

    Heroe(String nombreHeroico,int nivelDePoder,String descripcion){
        if(estaVacio(nombreHeroico)){
            throw new IllegalArgumentException("El nombre del Heroe no puede estar vacio");
        }else{
            this.nombreHeroico=nombreHeroico;
        }
        if(comprobarNivelDePoder(nivelDePoder)){
            this.nivelDePoder=nivelDePoder;
        }
        this.descripcion=descripcion;
    }

    protected boolean estaVacio(String nombre){
        if (nombre.trim().equals("") || nombre.equals(null)){
            return true;
        }
        return false;
    }

    private boolean comprobarNivelDePoder(int nivelDePoder){
        if(nivelDePoder<0){
            throw new IllegalArgumentException("El nivel de poder no puede ser negativo");
        }else if(nivelDePoder>100){
            throw new IllegalArgumentException("El nivel de poder no puede estar por encima de 100");
        }else {
            return true;
        }
    }

    public String getNombreHeroico() {
        return nombreHeroico;
    }

    public EstadioDePoder getEstadioDePoder(){
        return EstadioDePoder.getEstadioDePoder(this.nivelDePoder);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivelDePoder(){
        return this.nivelDePoder;
    }

    private void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public int subirNivel(){
        nivelDePoder++;
        return nivelDePoder;
    }

    @Override
    public String toString(){
        return nombreHeroico.substring(0,1).toUpperCase()+nombreHeroico.substring(1).toLowerCase()+"    Nvl:"+nivelDePoder+"\n      "+ descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroe heroe = (Heroe) o;
        return nivelDePoder == heroe.nivelDePoder &&
                Objects.equals(nombreHeroico, heroe.nombreHeroico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreHeroico, nivelDePoder);
    }
}