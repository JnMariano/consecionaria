    import deposito.estoque;
    import java.util.*;
    import usuarios.cliente;
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
                    System.out.println("\n\n\n\n\n\n\n\n\n");
                    System.out.println("=================================================");
                    System.out.println("Seja Bem-vindo, voce está na Seção de Funcionários");
                    System.out.println("=================================================");
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
                            System.out.println("\n\n\n\n\n\n\n\n\n");
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
                int secaocliente = input.nextInt() ;
                switch(secaocliente){
                    case 1:
                        //Seção de Lista d Carros
                        System.out.println("Aqui esta nossos carros");
                        estoque.lercarros();
                        break;
                        case 2:
                            //Seção de dúvidas do secaocliente
                            System.out.println("Digite sua duvida e assim que possivel um vendendor entrar em contato!");
                            String reclamar= input.next();
                            System.out.println("Sua reclamacao e: " + reclamar);
                            
                            
                            break;
                            case 3:
                                break;
                                case 4:
                                    // Seção de Cadastro do Cliente
                        System.out.println("Que bom que deseja se Cadastrar, Vamos iniciar!");
                        System.out.println("================================================="); 
                        System.out.println("Digite seu nome:" );
                        String nomeCliente = input.next();
                        System.out.println();
                        System.out.println("================================================="); 
                        System.out.println("Digite seu CPF");
                        String cpfCliente= input.next();
                        System.out.println();
                        System.out.println("================================================="); 
                        System.out.println("Digite sua Profissão");
                        String cargoCliente=input.next();
                        System.out.println();
                        System.out.println("================================================="); 
                        System.out.println("Digite sua idade");
                        int idadeCliente= input.nextInt();
                        System.out.println();
                        
                        System.out.println("================================================="); 
                        
                        break;
                    }
                    cliente.lerclientes();
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