import deposito.estoque;
import modelo.carro;
import modelo.pessoa;
import usuarios.vendedor;
public class loja {
    public static void main(String[] args) {
    estoque.listadecarros.add(new carro("Toyota","Corolla",2023,5000));
    estoque.lercarros();
    vendedor.listadefuncionarios.add(new pessoa("Juan","107.885.627-38", "Adm. Sistemas" , 25));

}
}
