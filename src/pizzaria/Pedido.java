package pizzaria;

import java.util.ArrayList;
import java.util.List;



public class Pedido {
    private Integer id = 0;
    private Cliente cliente;
    private List<Pizza> listaPizza = new ArrayList<>();
    private Integer quantidade = 0;
    private Double precoPedido = 0.00;

    public Pedido(){}
    public Pedido( Cliente cliente) {
        this.id = id += 1;
        this.cliente = cliente;  
        this.listaPizza = listaPizza;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Pizza> getListaPizza() {
        return listaPizza;
    }

    public void setListaPizza(List<Pizza> listaPizza) {
        this.listaPizza = listaPizza;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoPedido() {
        return precoPedido;
    }

    
    public void setPrecoPedido(Double precoPedido) {
        this.precoPedido = precoPedido;
    }

    
    
    public List adicionarListaPizza(  Pizza pizza ){        
        listaPizza.add(pizza);
        quantidade += 1;
        return  listaPizza;
    }
    
    public void  mostrarListaPizza( ){        
        for(Pizza o : listaPizza){
            System.out.println(o+"\n");
            
        }        
    }
    
    public List removerListaPizza(  Pizza pizza ){        
        listaPizza.remove(pizza);
        quantidade -= 1;
        return  listaPizza;
    }
   
    
    public Double CalcularPedido(){
    for(Pizza pizza : listaPizza ){
        precoPedido += pizza.getPreco();
    }
    return precoPedido;
    }
   

    @Override
    public String toString() {
        return "\nPedido(*):" + "\n"+cliente + "quantidade de pizzas=" + quantidade + ", preco do Pedido=" + String.format("%.2f", precoPedido) + '}';
    }

   
    
    
    
    
    
}
