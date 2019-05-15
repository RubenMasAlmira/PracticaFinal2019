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
    static {
        Map<String,Integer> estadios=new HashMap<>();
        for(EstadioDePoder e:EstadioDePoder.values()){
            estadios.put(e.nombre,e.limeteInferior);
        }
    }
    private static Map<String,Integer> estadios;
    public final String nombre;
    public final int limeteInferior;

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

    }
}
