import java.util.Objects;

public class Heroe {
    private final String nombreHeroico;
    private int nivelDePoder;
    private final String descripcion;

    Heroe(String nombreHeroico,int nivelDePoder,String descripcion){
        this.nombreHeroico=nombreHeroico;
        if(comprobarNivelDePoder(nivelDePoder)){
            this.nivelDePoder=nivelDePoder;
        }
        this.descripcion=descripcion;
    }

    protected boolean comprobarNivelDePoder(int nivelDePoder){
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
        for (EstadioDePoder e:EstadioDePoder.values()) {
            if(e.getLimeteSuperior()<=this.nivelDePoder && e.getLimeteInferior()>=this.nivelDePoder){
                return e;
            }
        }
        return null;
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
        return nombreHeroico.substring(0,1).toUpperCase()+nombreHeroico.substring(1).toLowerCase()+"\n      "+ descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Heroe)) return false;
        Heroe heroe = (Heroe) o;
        return Objects.equals(nombreHeroico, heroe.nombreHeroico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreHeroico);
    }
}