import java.io.*;
import java.util.*;

public class ListaDeHeroes implements Serializable {
    private final List<Heroe> listaHeroes;
    private final File ficheroDeGuardadoHeroes;

    ListaDeHeroes(String numeroDeIdentificacion){
        ficheroDeGuardadoHeroes=new File(numeroDeIdentificacion);
        listaHeroes=new ArrayList<>();

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
            new IllegalArgumentException("No se pudo leer la lista de Heroes correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Heroe> getLista(){
        return listaHeroes;
    }


    public ListaDeHeroes leer(File fichero) {
        ListaDeHeroes nuevaLista=null;
        try(ObjectInputStream ois=new ObjectInputStream( new FileInputStream(fichero))){
            nuevaLista=(ListaDeHeroes) ois.readObject();
        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Heroes correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista,el objeto elegido no lo era.");
            e.printStackTrace();
        }
        return nuevaLista;
    }
}
