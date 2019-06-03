import java.io.*;
import java.util.*;

public class ListaDeHeroes implements Serializable {
    private final Set<Heroe> listaHeroes=new HashSet<>();
    private final File ficheroDeGuardadoHeroes;

    ListaDeHeroes(String numeroDeIdentificacion){
        ficheroDeGuardadoHeroes=new File(numeroDeIdentificacion);
    }

    public void anyadirHeroe(Heroe heroeNuevo){
        listaHeroes.add(heroeNuevo);
    }

    public void eliminarHeroe(Heroe heroe){
        if(!listaHeroes.contains(heroe)){
            throw new IllegalArgumentException("El heroe que desea borrar no esta en la lista");
        }
        listaHeroes.remove(heroe);
    }



    public void escribir() {
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(ficheroDeGuardadoHeroes))){
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getMessage();
        }
    }
    public Set<Heroe> getLista(){
        return listaHeroes;
    }


    public static ListaDeHeroes leer(String ficheroDeGuardadoHeroes) {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(ficheroDeGuardadoHeroes))){

           return(ListaDeHeroes) ois.readObject();

        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Heroes correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
        new IllegalArgumentException("No se pudo leer la lista,el objeto elegido no era una ListaDeHeroes.");
    }
        return null;
    }
}
