import java.io.File;
import java.util.List;

public class Lector {
        private static Legible lista;
        private static File fichero;
        private Lector (Legible lista , File fichero){
            this.lista=lista;
            this.fichero=fichero;
        }

        public static void cambiarLector(Legible nuevaLista,File nuevoFichero){
            lista=nuevaLista;
            fichero=nuevoFichero;
        }

        public static List leer(){
            return lista.leer(fichero);
        }
}
