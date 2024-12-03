package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class DiaTrabalho {
    private Integer id;
    private List<Pedido> diaPedido = new ArrayList<>();
    
    
    public DiaTrabalho(Integer id,List<Pedido> diaPedido){
        this.id = id;
        this.diaPedido = diaPedido;
        
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    
    public List<Pedido> getDiaPedido() {
        return diaPedido;
    }

    public void setDiaPedido(List<Pedido> diaPedido) {
        this.diaPedido = diaPedido;
    }
    
    
    
    public List adicionarPedidoDoDia(  Pedido pedido ){        
        diaPedido.add(pedido);
        return  diaPedido;
    }
    
    public void  mostrarDiaPedido( ){        
        for(Pedido o : diaPedido){
            System.out.println(o);
        }        
    }
    
    public List removerDiaPedido(  Pedido pedido ){        
        diaPedido.remove(pedido);
        return  diaPedido;
    }

}
