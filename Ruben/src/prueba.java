import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class prueba {
    public static void main(String[] args) {
        Map<String,Integer> estadios=new HashMap<>();
        for(EstadioDePoder e:EstadioDePoder.values()){
            estadios.put(e.nombre,e.limeteInferior);
        }
        Iterator iterator=estadios.keySet().iterator();


        while(iterator.hasNext()){
            ;
        }
    }
}
