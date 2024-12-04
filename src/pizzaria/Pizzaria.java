package pizzaria;
import Sabores.Calabresa;
import Sabores.FrangoComCatupiry;
import Sabores.Marguerita;
import Sabores.QuatroQueijos;
import DAO.DAOCliente;
import DAO.DAODiaTrabalho;
import DAO.DAOPedido;
import DAO.DAOPizza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pizzaria {
    
    public static void menuGeral() {
        System.out.println("\n\n\n");
        
        System.out.println("1- Menu de  Pizzas");
        System.out.println("2-  Menu de Clientes");
        System.out.println("3-  Menu de Pedidos");
       
        
    } 
    public static void menuCliente() {
        System.out.println("\n\n\n");
        System.out.println("Selecione uma das seguintes opcoes:");
        System.out.println("1-Adicionar Cliente:");
        System.out.println("2-Consultar Cliente");
        System.out.println("3-Atualizar Cliente");
        System.out.println("4-Mostrar todos os Clientes");
        System.out.println("5-Remover  pizza");
        System.out.println("6-Sair do menu");
    }   
    public static void menuCrudPizzas() {
        System.out.println("\n\n\n");
        System.out.println("Selecione uma das seguintes opcoes:");
        System.out.println("1-Adicionar Pizza:");
        System.out.println("2-Consultar Pizza");
        System.out.println("3-Atualizar Pizza");
        System.out.println("4-Mostrar todas as pizzas");
        System.out.println("5-Remover  pizza");
        System.out.println("6-Sair do menu");
    }   
    
    public static void menuFinalDoDia() {
        System.out.println("\n\n\n");
        System.out.println(" Selecione uma das seguintes opcoes:");
        System.out.println("1-Consultar dia de trabalho");
        System.out.println("2-Atualizar dia de Trabalho");
        System.out.println("3-Mostrar todos os dias de Trabalho");
        System.out.println("4-Remover dia de trabalho");
        System.out.println("\n Relatorios: ");
         System.out.println("5-Exibir Pedido por cliente:");
        System.out.println("6-Exibir por dia trabalho");
        System.out.println("7-Finalizar o dia");
        
    }   
    
    
    public static void menuCrudPedidos() {
        System.out.println("\n\n\n");
        System.out.println("Selecione uma das seguintes opcoes:");
        System.out.println("1-Adicionar Pedido:");
        System.out.println("2-Consultar Pedido");
        System.out.println("3-Atualizar Pedido");
        System.out.println("4-Mostrar todos os pedidos");
        System.out.println("5-Remover Pedido");
        System.out.println("6-Mostrar Clientes");
        System.out.println("7-Sair do menu");
    }   
    
    public static void main(String[] args) {
        
        int geral, op1,op2,op3,op4,i,j;
        DAOCliente daocliente = new DAOCliente();
        DAOPizza daopizza = new DAOPizza();
        DAOPedido daopedido = new DAOPedido();
        DAODiaTrabalho daodiatrabalho = new DAODiaTrabalho();
        // Instanciações para testes rapidos
        daopizza.create(new Calabresa("Grande",35.0,"sem recheio"));
        daopizza.create(new FrangoComCatupiry("Media",23.50,"Recheio de Catupiry"));
        daopizza.create(new Marguerita("Pequena",15.0," recheio de mussarela"));
        daopizza.create(new QuatroQueijos("Grande",30.0,"sem recheio"));
        
        daocliente.create(new Cliente("Matheus","rua dos tucanos","vila leopoldina",85,"Araraquara-SP"));
        daocliente.create(new Cliente("Joao","rua Dom Pedro I","Ipiranga",23,"Guarapari-ES"));
        daocliente.create(new Cliente("Diego","rua Julio cesar","Jardim Marajoara",5,"Niteroi-RJ"));
        
        System.out.println("Bem vindo ao Sistema Da Pizzaria!");
        for( j = 1; j <= 7; j++) {
            int quantidadePedidosTotal = 0;
            int quantidadePedidosAtual = 0;
        System.out.println("Dia de trabalho: dia " + j);
        System.out.println("Quantos pedidos serao realizados hj?");
        Scanner Op = new Scanner(System.in);
        quantidadePedidosTotal = Op.nextInt();
        if(quantidadePedidosTotal == 0){
                System.out.println("Insira um numero maior do que zero\n");
                j -= 1;
        }
        else{
        List<Pedido> diaPedido = new ArrayList<>();
        
        
            do {
                menuGeral();
                geral = Op.nextInt();
                switch(geral){
                    
                    case 1:
                        menuCrudPizzas();
                        op1 = Op.nextInt();
                        switch(op1){
                            case 1: 
                                System.out.println("\n\n\n(1) calabresa"
                                        + "\n(2) Frango com Catupiry"
                                        + "\n(3) Marguerita"
                                        + "\n(4) Quatro queijos "
                                        + "\nQual Sabor de Pizza deseja: ");
                                int decsabor = Op.nextInt();
                                Op.nextLine();
                                System.out.println("tamanho");
                                String tamanho = Op.nextLine();
                                System.out.println("preco");
                                Double preco = Op.nextDouble();
                                Op.nextLine();
                                System.out.println("borda");
                                String borda = Op.nextLine();
                                
                                if(decsabor == 1)
                                    daopizza.create(new Calabresa(tamanho,preco,borda));
                                else if(decsabor == 2)
                                    daopizza.create(new FrangoComCatupiry(tamanho,preco,borda));
                                else if(decsabor == 3)
                                    daopizza.create(new Marguerita(tamanho,preco,borda));
                                else if(decsabor == 4)
                                    daopizza.create(new QuatroQueijos(tamanho,preco,borda));
                                else System.out.println("\n\n\nnumero invalido tente novamente");
                            break;
                            case 2:
                                System.out.println("\n\n\nInforme o Id da Pizza que deseja consultar: ");
                                int buscarpizza = Op.nextInt();
                                System.out.println(daopizza.read(buscarpizza)); 
                            break;
                            case 3:
                             System.out.println("\n\n\ninsira o id da pizza que deseja atualizar");
                              int atid = Op.nextInt();
                              Op.nextLine();
                            System.out.println("defina o tamanho da pizza: ");
                                String attamanho = Op.nextLine();
                                System.out.println("defina o preco da pizza: ");
                                Double atpreco = Op.nextDouble();
                                Op.nextLine();
                                System.out.println("defina a borda da pizza: ");
                                String atborda = Op.nextLine();
                                
                                Pizza pizzaUP = daopizza.read(atid);
                                pizzaUP.setTamanho(attamanho);
                                pizzaUP.setPreco(atpreco);
                                pizzaUP.setBorda(atborda);
                                daopizza.update(pizzaUP);
                            break;
                            case 4:
                                System.out.println(daopizza.listAll());
                            break;
                            case 5:
                                
                                System.out.println("\n\n\nInforme o id da pizza que deseja excluir: ");
                                int delpizza = Op.nextInt();
                                Pizza pizzaremove = daopizza.read(delpizza);
                                if(daopizza.delete(pizzaremove))
                                   System.out.println("Exclusao de pizza feita com sucesso");
                                else System.out.println("Exclusao feita com fracasso");
                            break;
                            
                        }
                        break;
                    
                    case 2 :
                        menuCliente();
                        op2 = Op.nextInt();
                        switch(op2){
                            case 1:
                                Op.nextLine();
                                System.out.println("\n\n\ninsira o nome do cliente : ");
                                String nome = Op.nextLine();
                                
                                
                                System.out.println("insira a rua do cliente: ");
                                
                                String rua = Op.nextLine();
                                
                              
                                System.out.println("insira o bairro do cliente: ");
                                String bairro = Op.nextLine();
                              
                                System.out.println("insira o numero do cliente: ");
                                int numero = Op.nextInt();
                                System.out.println("insira a cidade do cliente : ");
                                Op.nextLine();
                                String cidade = Op.nextLine();
                                
                             
                                daocliente.create(new Cliente(nome,rua,bairro,numero,cidade));
                                System.out.println("\nPerfil adicionado com sucesso!");
                            break;
                            case 2: 
                                System.out.println("\n\n\nInforme o Id do Cliente");
                                int buscarcliente = Op.nextInt();
                                System.out.println(daocliente.read(buscarcliente)); 
                            break;
                            case 3:
                                System.out.println("\n\n\ninsira o id do cliente que deseja atualizar");
                                int atid = Op.nextInt();
                                Op.nextLine();
                                System.out.println("insira o nome do cliente:");
                                String atnome = Op.nextLine();
                                System.out.println("insira a rua do cliente:");
                                Op.nextLine();
                                String atrua = Op.nextLine();
                                System.out.println("insira o bairro do cliente:");
                                
                                String atbairro = Op.nextLine();
                                System.out.println("insira o numero do cliente: ");
                                int atnumero = Op.nextInt();
                                System.out.println("insira a cidade do cliente: ");
                                Op.nextLine();
                                String atcidade = Op.nextLine();
                                
                                
                                Cliente clienteUP = daocliente.read(atid);
                                clienteUP.setNome(atnome);
                                clienteUP.setRua(atrua);
                                clienteUP.setBairro(atbairro);
                                clienteUP.setNumero(atnumero);
                                clienteUP.setCidade(atcidade);
                                daocliente.update(clienteUP);
                                
                               break;
                            case 4: 
                                 System.out.println("\n\n\n");
                                System.out.println(daocliente.listAll()); 
                            break;
                            case 5:
                                System.out.println("\n\n\nInforme o id do cliente que deseja excluir: ");
                                int delcliente = Op.nextInt();
                                Cliente clienteremove = daocliente.read(delcliente);
                                if(daocliente.delete(clienteremove))
                                   System.out.println("Exclusao com sucesso");
                                else System.out.println("Exclusao com fracasso");
                        }
                        break;
                    
                    
                    case 3 : 
                        menuCrudPedidos();
                    op3 = Op.nextInt();                            
                    switch(op3) {
                        case 1:
                            //chamada da função
                            System.out.println("\n\n\n escolha o cliente do pedido por id: ");
                            int clientepedido = Op.nextInt();
                            System.out.println("Escolha Quantas Pizzas deseja inserir no pedido: ");
                            int maxpizzas = Op.nextInt();
                            List<Pizza> pizzasDoCliente = new ArrayList();

                            for( i = 1; i <= maxpizzas; i++){
                                System.out.println("Selecione A pizza por id");
                                int selpizzaid = Op.nextInt();
                                    
                                    Pizza pizzaaux = daopizza.read(selpizzaid);
                                
                                    if(pizzaaux == null){
                                        System.out.println("Pizza nao encontrada tente novamente");
                                        pizzasDoCliente.clear();
                                        break;
                                    }
                                    
                                    
                                    pizzasDoCliente.add(pizzaaux);
                                
                                    
                                
                                
                            }
                            if(pizzasDoCliente.isEmpty()){
                                System.out.println("\nPedido nao permitido");
                            }
                            else{
                            Pedido pedidoaux = new Pedido(daocliente.read(clientepedido),pizzasDoCliente);
                            daopedido.create(pedidoaux);
                            diaPedido.add(pedidoaux);
                            quantidadePedidosAtual++;
                            }
                              
                            
                            
                            break;
                         case 2:
                            System.out.println("\n\n\n");
                            System.out.println("Consultar pedido");
                             System.out.println("Digite o Id do pedido");
                             int idpedido = Op.nextInt();
                             System.out.println(daopedido.read(idpedido));  
                             
                            break;
                        case 3:
                            System.out.println("\n\n\n");
                            System.out.println("Atualizar pedido");
                            System.out.println("Selecione o id do pedido: ");
                            int atid = Op.nextInt();
                            System.out.println("\n escolha o cliente do pedido por id: ");
                            int atclientepedido = Op.nextInt();
                            System.out.println("Escolha Quantas Pizzas inserir no pedido:");
                            int atmaxpizzas = Op.nextInt();
                            List<Pizza> atpizzasDoCliente = new ArrayList();
                            for(i = 1; i <= atmaxpizzas; i++){
                                System.out.println("Selecione A pizza por id:");
                                int selpizzaid = Op.nextInt();
                                atpizzasDoCliente.add(daopizza.read(selpizzaid));
                            }
                            Pedido pedidoUP = daopedido.read(atid);
                           
                            pedidoUP.setCliente(daocliente.read(atclientepedido));
                            pedidoUP.setListaPizza(atpizzasDoCliente);
                            pedidoUP.setQuantidade(atmaxpizzas);
                            daopedido.update(pedidoUP);
                            
                            for (int d = 1; i < diaPedido.size(); d++) {
                                if (diaPedido.get(i).getId() == atid) { // Supondo que getId retorna o ID
                                diaPedido.set(i, pedidoUP);
                                }
                                }
                           
                            
                        case 4:
                            System.out.println("\n\n\n");
                            System.out.println("Listando todos os pedidos...");
                            System.out.println(daopedido.listAll()); 
                            break;
                        case 5:
                            System.out.println("\n\n\n");
                            System.out.println("Remover pedido");
                            System.out.println("Informe o id do pedido que deseja excluir: ");
                                int delpedido = Op.nextInt();
                                Pedido pedidoremove = daopedido.read(delpedido);
                                if(daopedido.delete(pedidoremove)){
                                   System.out.println("Exclusao de pedido com sucesso");
                                   diaPedido.remove(delpedido);
                                }
                                else System.out.println("Exclusao do pedido não foi possivel tente novamente");
                            
                            break;
                        case 6:
                            System.out.println(daocliente.listAll());
                            break;
                        case 7:
                            System.out.println("\n\n\n");
                            System.out.println("saindo do menu...");
                            break;
                        default:
                            System.out.println("\n\n\n");
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;
            }
            }while(quantidadePedidosAtual < quantidadePedidosTotal);  
            do{
               
                menuFinalDoDia();
                op4 = Op.nextInt();
                DiaTrabalho diatrabalho = new DiaTrabalho(j,diaPedido);
                daodiatrabalho.create(diatrabalho);
                
                switch(op4) {
                    
                    case 1: 
                        System.out.println("\n\n\nDigite o dia que deseja verificar");
                        int verificardtrabalho = Op.nextInt();
                        if(daodiatrabalho.read(verificardtrabalho) == null)
                            System.out.println("Entrada Invalida");
                        else  System.out.println(daodiatrabalho.read(verificardtrabalho));
                        break;
                    case 2: 
                        System.out.println("\n\n\nescreva a id do diatrabalho que deseja atualizar: ");
                        int atid = Op.nextInt();
                        System.out.println("Agora escreva o id do pedido");
                        int diapedidoid = Op.nextInt();
                        
                         System.out.println("\n escolha o cliente do pedido por id: ");
                            int atclientepedido = Op.nextInt();
                            System.out.println("Escolha Quantas Pizzas deseja");
                            int atmaxpizzas = Op.nextInt();
                            List<Pizza> atpizzasDoCliente = new ArrayList();
                            for(i = 1; i <= atmaxpizzas; i++){
                                System.out.println("Selecione A pizza por id");
                                int selpizzaid = Op.nextInt();
                                atpizzasDoCliente.add(daopizza.read(selpizzaid));
                            }
                            DiaTrabalho diatrabalhoUP = daodiatrabalho.read(atid);
                            Pedido pedidoUP = daopedido.read(diapedidoid);
                            pedidoUP.setCliente(daocliente.read(atclientepedido));
                            pedidoUP.setListaPizza(atpizzasDoCliente);
                            daopedido.update(pedidoUP);
                            for (int d = 1; d < diaPedido.size(); d++) {
                                if (diaPedido.get(i).getId() == atid) { // Supondo que getId retorna o ID
                                diaPedido.set(i, pedidoUP);
                                }
                                }
                            diatrabalhoUP.setDiaPedido(diaPedido);
                            daodiatrabalho.update(diatrabalhoUP);
                        break;
                    case 3: 
                        System.out.println("\n\n\n");
                        System.out.println(daodiatrabalho.listAll());
                        break;
                    case 4:
                        System.out.println("\n\n\n");
                            System.out.println("remover pedido");
                            System.out.println("Informe o id do dia de trabalho que deseja excluir: ");
                                int iddiatrabalho = Op.nextInt();
                                DiaTrabalho diaremove = daodiatrabalho.read(iddiatrabalho);
                                if(daodiatrabalho.delete(diaremove)){
                                    daodiatrabalho.delete(diaremove);
                                   System.out.println("Exclusao com sucesso");                
                                }
                                else System.out.println("Exclusao com fracasso");
                    break; 
                    
                    case 5:
                        System.out.println("\n\n\n");
                        System.out.println("1-Exibir Pedido por cliente:");
                        System.out.println("Total de pedido: " + quantidadePedidosAtual);
                        System.out.println("Inseir o id do cliente");
                        int idcliente = Op.nextInt();
                        Cliente pcliente = daocliente.read(idcliente);
                        System.out.println(daopedido.PedidoPCliente(pcliente)); 
                        break;
                        case 6:
                            System.out.println("\n\n\n");
                            System.out.println("2-Exibir Pedido por dia ");
                            System.out.println("Inseir o id do dia");
                            int idpdia = Op.nextInt();
                            if(idpdia == 0 || idpdia > 7)
                                System.out.println("esse dia nao existe");
                            else{
                            DiaTrabalho pdiatrabalho = daodiatrabalho.read(idpdia);
                                System.out.println(daodiatrabalho.Pedidopdia(pdiatrabalho)); 
                            }
                            break;
                        case 7:
                            System.out.println("\n\n\n");
                            System.out.println("Dia "+j+ " finalizado");
                            break;
                        default:
                            System.out.println("\n\n\n");
                            System.out.println("Opção invalida");
                            break;
                }
            }while(op4!=7);
        }
        if(j == 7)
                System.out.println("Parabens voce finalizou a semana!!!");
        }
    }
}