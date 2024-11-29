package DAO;

import java.util.ArrayList;
import java.util.List;
import pizzaria.Pedido;



public class DAOPedido {
        private List<Pedido> databasePedido= new ArrayList();
    
    public void create(Pedido p) {
        databasePedido.add(p);
    }
    
    public Pedido read(int id) {
        for(Pedido p:databasePedido){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    public boolean update(Pedido p){
        Pedido paux=read(p.getId());
        if(paux!= null){
           
            paux.setListaPizza(p.getListaPizza());
            paux.setQuantidade(p.getQuantidade());
            paux.setPrecoPedido(p.getPrecoPedido());
            
            return true;
        }
        return false;
    }
    
    public boolean delete(Pedido p){
         Pedido paux=read(p.getId());
        if(paux!= null){
            databasePedido.remove(p);
            return true;
        }
        return false;
    }

    public String listAll(){
        String report="";
        for(Pedido p:databasePedido){
            report+= "Id: "+ p.getId()+"\n";
            report+=  p.getCliente()+"\n";
            report+= "Pizzas Pedidas: "+ p.getListaPizza()+"\n";
            report+= "Quantidade de Pizzas: "+ p.getQuantidade()+ "Pizza(s)" + "\n";
            report+= "Preco total: "+ p.getPrecoPedido()+"\n\n";
        }
        return report;
    }
    
}
