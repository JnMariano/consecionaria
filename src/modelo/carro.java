package modelo;

public class carro {
        public String marca;
        public String modelo;
        public int ano;
        public int preco;

        public carro(String marca, String modelo, int ano, int preco) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.preco = preco;
        }      
    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + ") - R$" + preco;
    }
}
