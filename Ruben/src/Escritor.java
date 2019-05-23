import java.io.File;

public class Escritor {
    private static Escritor miEscritor;
    public static Escritor getEscritor(){
        return miEscritor;
    }


    private static Escribible lista;
    private static File fichero;


    private Escritor(Escribible lista , File fichero){
        this.lista=lista;
        this.fichero=fichero;
    }

    public void cambiarEscritor(Escribible e,File fichero){
        this.lista=e;
        this.fichero=fichero;
    }

    private static void escribir(){
        lista.escribir(fichero);
    }
}
