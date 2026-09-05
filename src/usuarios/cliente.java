package usuarios;
import java.util.*;
public class cliente {
    public static ArrayList<cliente> listadeclientes = new ArrayList<>();
    public static void lerclientes(){
        listadeclientes.forEach(System.out::println);
    }
}
