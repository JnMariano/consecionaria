import deposito.estoque;
import java.util.*;
import usuarios.gerente;
public class loja {
    public static void main(String[] args) {
        gerente.teste();
        Scanner input = new Scanner(System.in);
        int menu = 5;
        do {
        System.out.println("===============================");
        System.out.println(" Sejam Bem-vindos à nossa Loja");
        System.out.println("===============================");
        System.out.println(" Como podemos ser util?" );
        System.out.println("===============================");
        System.out.println("Escolha uma Opção: \n 1- Funcionários. \n 2- Clientes. \n 3- Empresas. ");
        System.out.println("===============================");
        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
                menu = escolha; 
                break;
                case 2:
                System.out.println("\n\n\n\n\n\n\n\n\n");
                System.out.println("=================================================");
                System.out.println(" Seja Bem-vindo, voce esta na secao dos clientes!");
                System.out.println("================================================="); 
                System.out.println("          O que voce gostaria de fazer?");   
                System.out.println("================================================="); 
                System.out.println(" 1- Listar Carros \n 2- Falar com um vendedor \n 3- Fazer orcamento. \n 4- Cadastro para Garantir Desconto");
                menu = escolha;
                    break;
                    case 3:
                        menu = escolha;
                        break;
                    }
        }
        while(menu>4);
            if(menu == 1){
            System.out.println("Selecione a opcao: ")  ;
            int funcionario = input.nextInt() ;
            switch(funcionario){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } 
        if(menu == 2){
            System.out.println("Selecione a opcao: ")  ;
            int cliente = input.nextInt() ;
            switch(cliente){
                case 1:
                    System.out.println("Aqui esta nossos carros");
                    estoque.lercarros();
                    break;
                case 2:
                    System.out.println("Digite sua duvida e assim que possivel um vendendor entrar em contato!");
                    int reclamar= input.nextInt();

                    break;
                case 3:
                    break;
                case 4:
                    break;
                }
            
        } 
        if(menu == 3){
            System.out.println("Selecione a opcao: ")  ;
            int empresa = input.nextInt() ;
            switch(empresa){
                case 1:
                    System.out.println(""); 
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                }
            
        } 
        
        input.close();
}
}