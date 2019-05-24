import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Usuario implements Escribible,Legible{

    private final String  numeroDeIndentificacion;
    private final String nombre;
    private final String apellidos;
    private String correoElectronico;
    private String fechaDeNacimiento;
    private String fechaDeRegistro;
    private ListaDeHeroes lista;

    public Usuario(String numeroDeIndentificacion, String nombre, String apellidos, String correoElectronico,String fechaDeNacimiento) {
        this.numeroDeIndentificacion = numeroDeIndentificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.fechaDeRegistro=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        this.lista=new ListaDeHeroes(numeroDeIndentificacion);
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

    public String getNumeroDeIndentificacion() {
        return numeroDeIndentificacion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return numeroDeIndentificacion == usuario.numeroDeIndentificacion;
    }

    public String impresionDeUsuario() {
        String salida="";
       salida+=this.numeroDeIndentificacion+" \n";
       salida+=this.nombre+" \n";
       salida+=this.apellidos+" \n";
       salida+=this.correoElectronico+" \n";
       salida+=this.fechaDeNacimiento+" \n";
       salida+=this.fechaDeRegistro+" \n";
       return salida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeIndentificacion);
    }


    @Override
    public void escribir( File fichero) {

    }

    @Override
    public List leer(File fichero) {
        if (!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                new IllegalArgumentException("No se ha encontrado el fichero");
            }
        }
        List<String> lineas=null;
        List<Usuario> usuarios=null;
        try {
            lineas = Files.readAllLines(Paths.get(fichero.toURI()));
            Iterator iterator=lineas.iterator();
            usuarios=new ArrayList<>();


            while(iterator.hasNext()){
                usuarios.add(new Usuario((String)iterator.next(),(String)iterator.next(),(String)iterator.next(),(String)iterator.next(),(String)iterator.next()));
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return usuarios;
    }
}
