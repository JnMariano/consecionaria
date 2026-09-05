package deposito;
import java.util.ArrayList;
import modelo.carro;


public class estoque{
        public static ArrayList<carro> listadecarros = new ArrayList<>();
        public static void lercarros(){
            listadecarros.forEach(System.out::println);
            
        }
        
    }