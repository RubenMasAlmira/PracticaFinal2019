import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Usuario implements Escribible{
    private static File ficheroDeUsuarios=new File("Usuarios");
    private final long numeroDeIndentificacion;
    private final String nombre;
    private final String apellidos;
    private String correoElectronico;
    private final ListaDeHeroes lista=new ListaDeHeroes();
    static{
        if (!ficheroDeUsuarios.exists()){
            try {
                ficheroDeUsuarios.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Usuario(long numeroDeIndentificacion, String nombre, String apellidos, String correoElectronico) {
        this.numeroDeIndentificacion = numeroDeIndentificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ListaDeHeroes getLista() {
        return lista;
    }

    public long getNumeroDeIndentificacion() {
        return numeroDeIndentificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return numeroDeIndentificacion == usuario.numeroDeIndentificacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeIndentificacion);
    }


    @Override
    public void escribir(File fichero) {
        try(FileWriter fw=new f){}
    }
}
