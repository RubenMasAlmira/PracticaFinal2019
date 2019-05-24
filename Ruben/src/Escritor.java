import java.io.File;

public class Escritor {
    private  Escribible lista;
    private File fichero;


    private Escritor(Escribible lista , File fichero){
        this.lista=lista;
        this.fichero=fichero;
    }

    public void cambiarEscritor(Escribible lista,File fichero){
        this.lista=lista;
        this.fichero=fichero;
    }

    private void escribir(){
        lista.escribir(fichero);
    }
}
