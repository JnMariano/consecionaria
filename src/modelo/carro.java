package modelo;

public class carro {
        public int id;
        public String marca;
        public String modelo;
        public int ano;
        public int preco;

        public carro(int id,String marca, String modelo, int ano, int preco) {
            this.id= id;
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.preco = preco;
        }      
    @Override
    public String toString() {
        return "ID: " + id + " "+ " Marca: " + marca +  " | " +  "Modelo: " + modelo + " | (" + ano + ") | - R$" + preco;
    }
}
