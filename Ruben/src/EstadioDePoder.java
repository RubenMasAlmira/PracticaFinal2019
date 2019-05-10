public enum EstadioDePoder {
    OMNICO("Omnico",100,91),
    GUARDIAN_UNIVERSAL("Guardian Univesal",90,81),
    MULTIVERSAL("Multiversal",80,71),
    ENTIDAD_COSMICA("Entidad Cosmica",70,61),
    ARMONICO("Armónico",60,51),
    UNIVERSAL("Universal",50,41),
    GALACTICOS("Galactico",40,31),
    PLANETARIOS("Planetario",30,21),
    SUPERIOR("Superior",20,11),
    MUNDANO("Mundano",10,0);

    private final String nombre;
    private final int limeteSuperior;
    private final int limeteInferior;

    EstadioDePoder(String nombreDelEstadio,int limeteSuperior,int limeteInferior){
        this.nombre=nombreDelEstadio;
        this.limeteInferior=limeteInferior;
        this.limeteSuperior=limeteSuperior;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLimeteInferior() {
        return limeteInferior;
    }

    public int getLimeteSuperior() {
        return limeteSuperior;
    }


}
