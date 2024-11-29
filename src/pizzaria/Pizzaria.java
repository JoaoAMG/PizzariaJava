package pizzaria;


import Sabores.Calabresa;
import Sabores.FrangocomCatupiry;
import Sabores.Marguerita;
import Sabores.QuatroQueijos;
import DAO.DAOCliente;
import DAO.DAODiaTrabalho;
import DAO.DAOPedido;
import DAO.DAOPizza;
import java.util.Scanner;




public class Pizzaria {
    
    public static void main(String[] args) {
//        Pizza p1 = new Calabresa("medio", 22.40, "Nao");
//        Pizza p2 = new FrangocomCatupiry("Grande", 32.40, "Nao");
//        Pizza p3 = new Marguerita("pequena", 23.40, "Nao");
//        Pizza p4 = new QuatroQueijos("medio", 27.40, "Nao");
//        
//        Cliente c1 = new Cliente("ju", "passa", "flor", 102, "boituva");
//        
//        
//        Pedido pedido1 = new Pedido(c1);
//        pedido1.adicionarListaPizza(p1);
//        pedido1.adicionarListaPizza(p2);
//        pedido1.adicionarListaPizza(p3);
//        pedido1.adicionarListaPizza(p4);
//        
//        Pedido pedido2 = new Pedido(c1);
//        pedido2.adicionarListaPizza(p1);
//        pedido2.adicionarListaPizza(p2);
//        pedido2.adicionarListaPizza(p3);
//        pedido2.adicionarListaPizza(p3);
//        
//        Pedido pedido3 = new Pedido(c1);
//        pedido3.adicionarListaPizza(p4);
//        pedido3.adicionarListaPizza(p2);
//        pedido3.adicionarListaPizza(p3);
//        pedido3.adicionarListaPizza(p2);
//        
//        Pedido pedido4 = new Pedido(c1);
//        pedido4.adicionarListaPizza(p1);
//        pedido4.adicionarListaPizza(p1);
//        pedido4.adicionarListaPizza(p2);
//        pedido4.adicionarListaPizza(p2);
//        
////        pedido1.removerListaPizza(p4);
////        pedido1.mostrarListaPizza();
//          pedido1.CalcularPedido();
//          pedido2.CalcularPedido();
//          pedido3.CalcularPedido();
//          pedido4.CalcularPedido();
////        System.out.println(pedido1);
//        DiaTrabalho dia1 = new DiaTrabalho(2);
//        dia1.adicionarPedidoDoDia(pedido1);
//        dia1.adicionarPedidoDoDia(pedido4);
//        
//        DiaTrabalho dia2 = new DiaTrabalho(4);
//        dia2.adicionarPedidoDoDia(pedido1);
//        dia2.adicionarPedidoDoDia(pedido2);
//        dia2.adicionarPedidoDoDia(pedido3);
//        dia2.adicionarPedidoDoDia(pedido4);
//        
//        dia1.mostrarDiaPedido();
//        dia2.mostrarDiaPedido();
        
        //Testando Dao's
        
//        DAOPedido daopedido = new DAOPedido();
//        daopedido.create(pedido1);
//        daopedido.create(pedido2);
//        daopedido.create(pedido3);
//        daopedido.create(pedido4);
//        System.out.println("\n\nTestando List All da dao pedido\n");
//        System.out.println(daopedido.listAll());
    
    
    }
}
//    public static void main(String[] args) {
//        int op,op1,op2, login = 1;
//        while (login != 0){
//        System.out.println("Bem vindos a Pizzaria"
//                + "\ndigite 1 para logar como administrador"
//                + "\ndigite 2 Para logar como Usuario ");
//        Scanner sc = new Scanner(System.in);
//        op = sc.nextInt();
//        
//        switch(op){
//            case 1:
//                System.out.println("\n\nSelecione uma das Opcoes"
//                + "\n(1) Gerenciar Lista de Pizzas"
//                + "\n(2) Gerenciar Lista de Pedidos"
//                + "\n(3) Gerenciar Lista de Clientes"
//                + "\n(4) Gerenciar Lista de Dias Trabalhados");
//    
//                op1 = sc.nextInt();
//                DAOCliente daocliente = new DAOCliente();
//                DAODiaTrabalho daodiatrabalho = new DAODiaTrabalho();
//                DAOPedido daopedido = new DAOPedido();
//                DAOPizza daopizza = new DAOPizza();
//                
//                switch(op1){
//                    case 1: 
//                        System.out.println("\n(1) Adicionar Pizza"
//                                + "\n(2) Selecionar Pizza"
//                                + "\n(3) Atualizar Pizza"
//                                + "\n(4) Remover Pizza");
//                        break;
//                
//                }
//                break;
//            case 2:
//                System.out.println("\nSeja Bem vindo Cliente Insira seus dados");
//                System.out.println("insira seu nome");
//                String nome = sc.next();
//                System.out.println("insira sua rua");
//                String rua = sc.next();
//                System.out.println("insira seu bairro");
//                String bairro = sc.next();
//                System.out.println("insira seu numero");
//                int numero = sc.nextInt();
//                System.out.println("insira seu cidade");
//                String cidade = sc.next();
//                
//                Cliente cliente = new Cliente(nome,rua,bairro,numero,cidade);
//                Pedido pedido = new Pedido(cliente);
//                System.out.println("\nSelecione uma das Opcoes"
//                        + "\n(1) Adicionar Pizza\n(2) Ver Pedido"
//                        + "\n(3) remover pizza"
//                        + "\n(4) finalizar pedido\n(5) ver pedidos ja feitos");
//                op2 = sc.nextInt();
//                
//                switch(op2) {
//                    case 1: 
//                        System.out.println("Digite qual Sabor deseja"
//                                + "\n1(calabresa) 2(Frango com Catupriy) 3(Marguerita) 4(Quatro Queijos)");
//                        int opsabor = sc.nextInt();
//                        System.out.println("Insira o tamanho da pizza");
//                        String tamanho = sc.next();
//                        System.out.println("Insira se deseja borda recheada e qual sabor deseja");
//                        String borda = sc.next();
//
//                        if(opsabor == 1 ){
//                            Pizza pizza = new Calabresa(tamanho,22.5,borda);
//
//                             pedido.adicionarListaPizza(pizza);
//                        }
//                        else if(opsabor == 2 ){
//                            Pizza pizza = new FrangocomCatupiry(tamanho,22.5,borda);
//                              pedido.adicionarListaPizza(pizza);
//
//                        }
//                        else if(opsabor == 3 ){
//                            Pizza pizza = new Marguerita(tamanho,22.5,borda);
//
//                             pedido.adicionarListaPizza(pizza);
//                        }
//                        else if(opsabor == 4 ){
//                            Pizza pizza = new QuatroQueijos(tamanho,22.5,borda);
//
//                             pedido.adicionarListaPizza(pizza);
//                            
//                        }
//                        else{ 
//                            System.out.println("Sabor nao existe");
//
//                        }  
//                        
//                    break;
//                    case 2: 
//                        pedido.CalcularPedido();
//                        System.out.println(pedido);
//                        
//                        break;
//                    case 3: 
//                        break;
//                    case 4:
//                        System.out.println("");
//                        sc.next();
//                        break;
//                    case 5: 
//                        pedido.toString();
//                    
//                         
//            
//                }
//                
//        }
//                
//        
//        }
//        
//        
//       
//        
//        
//                
//            
//        
//    }
//    
//}
