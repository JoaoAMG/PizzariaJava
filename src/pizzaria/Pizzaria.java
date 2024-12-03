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
        System.out.println(" 1  Pizzas");
        System.out.println(" 2  Clientes");
        System.out.println("3-  Pedidos");
       
        
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
        int quantidadePedidosTotal = 0;
        int quantidadePedidosAtual = 0;
        int geral, op1,op2,op3,op4;
        DAOCliente daocliente = new DAOCliente();
        DAOPizza daopizza = new DAOPizza();
        DAOPedido daopedido = new DAOPedido();
        DAODiaTrabalho daodiatrabalho = new DAODiaTrabalho();
        
        for(int i = 1; i <= 7; i++) {
        System.out.println("Dia de trabalho: dia " + i);
        System.out.println("Quantos pedidos serao realizados hj?");
        Scanner Op = new Scanner(System.in);
        quantidadePedidosTotal = Op.nextInt();  
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
                                System.out.println("\n\n\n (1) calabresa"
                                        + "\n(2) Frango com Catupiry"
                                        + "\n(3) Marguerita"
                                        + "\n (4) Quatro queijos "
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
                                System.out.println("\n\n\nInforme o Id da Pizza");
                                int buscarpizza = Op.nextInt();
                                System.out.println(daopizza.read(buscarpizza)); 
                            break;
                            case 3:
                             System.out.println("\n\n\ninsira o id da pizza que deseja atualizar");
                              int atid = Op.nextInt();
                              Op.nextLine();
                            System.out.println("defina o tamanho: ");
                                String attamanho = Op.nextLine();
                                System.out.println("defina o preco: ");
                                Double atpreco = Op.nextDouble();
                                Op.nextLine();
                                System.out.println("defina a borda: ");
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
                                   System.out.println("Exclusao com sucesso");
                                else System.out.println("Exclusao com fracasso");
                            break;
                            
                        }
                        break;
                    
                    case 2 :
                        menuCliente();
                        op2 = Op.nextInt();
                        switch(op2){
                            case 1:
                                Op.nextLine();
                                System.out.println("\n\n\ninsira seu nome");
                                String nome = Op.nextLine();
                                
                                
                                System.out.println("insira sua rua");
                                
                                String rua = Op.nextLine();
                                
                              
                                System.out.println("insira seu bairro");
                                String bairro = Op.nextLine();
                              
                                System.out.println("insira seu numero");
                                int numero = Op.nextInt();
                                System.out.println("insira seu cidade");
                                Op.nextLine();
                                String cidade = Op.nextLine();
                                
                             
                                daocliente.create(new Cliente(nome,rua,bairro,numero,cidade));
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
                                System.out.println("insira seu nome");
                                String atnome = Op.nextLine();
                                System.out.println("insira sua rua");
                                Op.nextLine();
                                String atrua = Op.nextLine();
                                System.out.println("insira seu bairro");
                                
                                String atbairro = Op.nextLine();
                                System.out.println("insira seu numero");
                                int atnumero = Op.nextInt();
                                System.out.println("insira seu cidade");
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
                            System.out.println("Escolha Quantas Pizzas deseja");
                            int maxpizzas = Op.nextInt();
                            List<Pizza> pizzasDoCliente = new ArrayList();
                            for(i = 1; i <= maxpizzas; i++){
                                System.out.println("Selecione A pizza por id");
                                int selpizzaid = Op.nextInt();
                                pizzasDoCliente.add(daopizza.read(selpizzaid));
                            }
                            
                            daopedido.create(new Pedido(daocliente.read(clientepedido),pizzasDoCliente));
                            diaPedido.add(new Pedido(daocliente.read(clientepedido),pizzasDoCliente));
                            int funcalcularpedido = 0;
                              
                            
                            quantidadePedidosAtual++;
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
                            System.out.println("Escolha Quantas Pizzas deseja");
                            int atmaxpizzas = Op.nextInt();
                            List<Pizza> atpizzasDoCliente = new ArrayList();
                            for(i = 1; i <= atmaxpizzas; i++){
                                System.out.println("Selecione A pizza por id");
                                int selpizzaid = Op.nextInt();
                                atpizzasDoCliente.add(daopizza.read(selpizzaid));
                            }
                            Pedido pedidoUP = daopedido.read(atid);
                            pedidoUP.setCliente(daocliente.read(atclientepedido));
                            pedidoUP.setListaPizza(atpizzasDoCliente);
                            daopedido.update(pedidoUP);
                            diaPedido.remove(atid);
                            diaPedido.add(pedidoUP);
                           
                            
                        case 4:
                            System.out.println("\n\n\n");
                            System.out.println("Listando todos os pedidos");
                            System.out.println(daopedido.listAll()); 
                            break;
                        case 5:
                            System.out.println("\n\n\n");
                            System.out.println("remover pedido");
                            System.out.println("Informe o id do pedido que deseja excluir: ");
                                int delpedido = Op.nextInt();
                                Pedido pedidoremove = daopedido.read(delpedido);
                                if(daopedido.delete(pedidoremove)){
                                   System.out.println("Exclusao com sucesso");
                                   diaPedido.remove(delpedido);
                                }
                                else System.out.println("Exclusao com fracasso");
                            
                            break;
                        case 6:
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
                DiaTrabalho diatrabalho = new DiaTrabalho(i,diaPedido);
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
                            diaPedido.remove(atid);
                            diaPedido.add(pedidoUP);
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
                                   System.out.println("Exclusao com sucesso");                
                                }
                                else System.out.println("Exclusao com fracasso");
                    break; 
                    
                    case 5:
                        System.out.println("\n\n\n");
                        System.out.println("Exibir Pedido por cliente:");
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
                            System.out.println("Dia "+i+ " finalizado");
                            break;
                        default:
                            System.out.println("\n\n\n");
                            System.out.println("Opção invalida");
                            break;
                }
            }while(op4!=7);
        }
    }
}