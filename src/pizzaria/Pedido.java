package pizzaria;

import java.util.ArrayList;
import java.util.List;



public class Pedido {
    private static int inc = 1;
    private Integer id ;
    private Cliente cliente;
    private List<Pizza> listaPizza = new ArrayList<>();
    private Integer quantidade = 0;
    private Double precoPedido;

    public Pedido(){}
    public Pedido( Cliente cliente, List<Pizza> listaPizza ) {
        this.id = inc++;
        this.cliente = cliente;  
        this.listaPizza = listaPizza;
        this.quantidade = listaPizza.size();
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

    
    

   
    
    public Double CalcularPedido(){
    precoPedido = 0.0;
        
    for(Pizza pizza : listaPizza ){
        
        precoPedido += pizza.getPreco();
    }
    return precoPedido;
    }
   

    @Override
    public String toString() {
        return "\nPedido(*):" + "\n"+ cliente.getNome() + " quantidade de pizzas=" + quantidade  + ", preco do Pedido=" + String.format("%.2f", CalcularPedido()) + '}';
    }

   
    
    
    
    
    
}
