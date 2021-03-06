import java.io.*;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class Usuario implements Escribible{
    public static final int CANTIDAD_DE_NUMEROS_IDENTIFICACION = 10;
    public static int LINEAS_DE_LECTURA=6;
    private final String indentificacionDeUsuario;
    private final String nombre;
    private final String apellidos;
    private String correoElectronico;
    private String fechaDeNacimiento;
    private String fechaDeRegistro;
    private ListaDeHeroes listaDeHeroes;

    public Usuario(String indentificacionDeUsuario, String nombre, String apellidos, String correoElectronico, String fechaDeNacimiento,String fechaDeRegistro, String ficheroDeGuardado) {
        if(indentificacionDeUsuario.length()!= CANTIDAD_DE_NUMEROS_IDENTIFICACION){
            throw new IllegalArgumentException("El  identificador de usuario ha de tener 10 carácteres");
        }
        this.indentificacionDeUsuario = indentificacionDeUsuario;
        if (Utilidades.comprobarVacio(nombre)) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.fechaDeRegistro=fechaDeRegistro;
        if(Utilidades.comprobarVacio(ficheroDeGuardado) || !Paths.get(ficheroDeGuardado).toFile().exists()){
            this.listaDeHeroes =new ListaDeHeroes(indentificacionDeUsuario);

        }else{
            this.listaDeHeroes = ListaDeHeroes.leer(indentificacionDeUsuario);

        }
    }

    public Usuario(String indentificacionDeUsuario, String nombre, String apellidos, String correoElectronico, String fechaDeNacimiento) {
        this(indentificacionDeUsuario,nombre,apellidos,correoElectronico,fechaDeNacimiento
                ,new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()),null);
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

    public ListaDeHeroes getListaDeHeroes() {
        return listaDeHeroes;
    }

    public String getIndentificacionDeUsuario() {
        return indentificacionDeUsuario;
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
        return indentificacionDeUsuario == usuario.indentificacionDeUsuario;
    }


    @Override
    public int hashCode() {
        return Objects.hash(indentificacionDeUsuario);
    }


    @Override
    public String stringDeEscritura() {
        String salida="";
        salida+=this.indentificacionDeUsuario +"\n";
        salida+=this.nombre+"\n";
        salida+=this.apellidos+"\n";
        salida+=this.correoElectronico+"\n";
        salida+=this.fechaDeNacimiento+"\n";
        salida+=this.fechaDeRegistro+"\n";
        return salida;
    }

    @Override
    public String toString() {
        return "IDUsuario='" + indentificacionDeUsuario + "\n" +
                "nombre=" + nombre + "\n" +
                "apellidos='" + apellidos + "\n" +
                "correoElectronico=" + correoElectronico + "\n" +
                "fechaDeNacimiento=" + fechaDeNacimiento + "\n" +
                "fechaDeRegistro=" + fechaDeRegistro + "\n" +
                "listaDeHeroes=" + listaDeHeroes;
    }
}
