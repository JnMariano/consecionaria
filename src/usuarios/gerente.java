package usuarios;
import deposito.estoque;
import modelo.carro;
import modelo.pessoa;

public class gerente {
    public static void teste(){
        vendedor.listadefuncionarios.add(new pessoa("Juan", "107.885.627-38", "Gerente", 25));
        estoque.listadecarros.add(new carro("honda", "kwid", 2026, 500000));
    }
    //função do gerente é demitir e contratar pessoas.
    public static void main(String[] args) {
    }

}