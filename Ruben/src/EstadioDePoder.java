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
    private final int limeteDeNivelInferior;

    EstadioDePoder(String nombreDelEstadio,int limeteInferior){
        this.nombre=nombreDelEstadio;
        this.limeteDeNivelInferior =limeteInferior;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLimeteDeNivelInferior() {
        return limeteDeNivelInferior;
    }

    public static EstadioDePoder getEstadioDePoder(int poder){
        EstadioDePoder[] estadios=EstadioDePoder.values();
        for(EstadioDePoder estadio:estadios){
            if(poder>=estadio.limeteDeNivelInferior){
                return estadio;
            }
        }
        return null;
    }
}
