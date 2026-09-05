package usuarios;
import java.util.*;
import modelo.pessoa;
public class vendedor  {
    public static ArrayList<pessoa> listadefuncionarios= new ArrayList<>();

    public static void lerfuncionarios(){
        listadefuncionarios.forEach(System.out::println);
    
    }
}
