package modelo;

public class pessoa {
    public String nome;
    public String cpf;
    public String cargo;
    public int idade;
    
    public pessoa(String nome, String cpf, String cargo, int idade){
        this.nome=nome;
        this.cpf=cpf;
        this.cargo=cargo;
        this.idade=idade;
    }

@Override
public String toString(){
    return "Nome" + nome + "CPF" + cpf + "Cargo" + cargo + "Idade" + idade;
}
}
