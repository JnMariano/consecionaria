package usuarios;
import modelo.pessoa;
import java.util.*;
public class vendedor {
    public static ArrayList<pessoa> listadefuncionarios= new ArrayList<>();

    public static void lerfuncionarios(){
        listadefuncionarios.forEach(System.out::println);
    
    }
}
