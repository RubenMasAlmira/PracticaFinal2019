import java.util.Objects;

public class Heroe{
    protected final String nombreHeroico;
    protected int nivelDePoder;
    protected final String descripcion;

    Heroe(String nombreHeroico,String nivelDePoder,String descripcion){
        if(Utilidades.comprobarVacio(nombreHeroico)){
            throw new IllegalArgumentException("El nombre del Heroe no puede estar vacio");
        }else{
            this.nombreHeroico=nombreHeroico;
        }
        if(comprobarNivelDePoder(nivelDePoder)){
            this.nivelDePoder=Integer.parseInt(nivelDePoder);
        }
        this.descripcion=descripcion;
    }

    private boolean comprobarNivelDePoder(String nivelDePoder){
        try{
            Integer.parseInt(nivelDePoder);
        }catch (NumberFormatException nfe){
            new IllegalArgumentException("El nivel de poder ha de ser un número entero del 0 al 100");
        }
        int nivel=Integer.parseInt(nivelDePoder);
        if(nivel<0){
            throw new IllegalArgumentException("El nivel de poder no puede ser negativo");
        }else if(nivel>100){
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
        if(nivelDePoder>100){
            throw new IllegalArgumentException("El nivel de "+nombreHeroico+"es el maximo");
        }
        return nivelDePoder++;
    }

    @Override
    public String toString(){
        return nombreHeroico+"    Nvl:"+nivelDePoder+"\n      ";
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