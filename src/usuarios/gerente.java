package usuarios;
import deposito.estoque;
import modelo.carro;
import modelo.pessoa;

public class gerente {
    public static void teste(){
        vendedor.listadefuncionarios.add(new pessoa("Juan", "107.885.627-38", "Gerente", 25));
        estoque.listadecarros.add(new carro(1,"honda", "kwid", 2026, 50000));
        estoque.listadecarros.add(new carro(2, "honda", "Gol", 2000, 10000));
    }
    //função do gerente é demitir e contratar pessoas e cadastrar os itens.
    public static void main(String[] args) {
    }

}