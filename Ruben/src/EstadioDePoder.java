import java.util.*;

public enum EstadioDePoder {
    OMNICO("Omnico",90),
    GUARDIAN_UNIVERSAL("Guardian Univesal",80),
    MULTIVERSAL("Multiversal",70),
    ENTIDAD_COSMICA("Entidad Cosmica",60),
    ARMONICO("Armónico",50),
    UNIVERSAL("Universal",40),
    GALACTICOS("Galactico",30),
    PLANETARIOS("Planetario",20),
    SUPERIOR("Superior",10),
    MUNDANO("Mundano",0);

    private final String nombre;
    private final int limeteInferior;

    EstadioDePoder(String nombreDelEstadio,int limeteInferior){
        this.nombre=nombreDelEstadio;
        this.limeteInferior=limeteInferior;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLimeteInferior() {
        return limeteInferior;
    }

    public static EstadioDePoder getEstadioDePoder(int poder){
        EstadioDePoder[] estadios=EstadioDePoder.values();
        for(EstadioDePoder estadio:estadios){
            if(poder>=estadio.limeteInferior){
                return estadio;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"-"+getEstadioDePoder(i));

        }
    }
}
