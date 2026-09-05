package modelo;

public class pessoa {
    private String nome;
    private String cpf;
    private String cargo;
    private int idade;
    
    public pessoa(String nome, String cpf, String cargo, int idade){
        this.nome=nome;
        this.cpf=cpf;
        this.cargo=cargo;
        this.idade=idade;
    }
    

@Override
public String toString(){
    return " Nome: " + nome + " CPF: " + cpf + " Cargo: " + cargo + " Idade: " + idade;
}
}
