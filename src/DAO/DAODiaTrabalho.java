package DAO;

import java.util.ArrayList;
import java.util.List;
import pizzaria.DiaTrabalho;


public class DAODiaTrabalho {
    
    private List<DiaTrabalho> databaseDiaTrabalho= new ArrayList();
    
    public void create( DiaTrabalho p) {
        databaseDiaTrabalho.add(p);
    }
    
    public DiaTrabalho read(int id) {
        for(DiaTrabalho p:databaseDiaTrabalho){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    public boolean update(DiaTrabalho p){
        DiaTrabalho paux=read(p.getId());
        if(paux!= null){
            paux.setDiaPedido(p.getDiaPedido());
           
            
            return true;
        }
        return false;
    }
    
    public boolean delete(DiaTrabalho p){
         DiaTrabalho paux=read(p.getId());
        if(paux!= null){
            databaseDiaTrabalho.remove(p);
            return true;
        }
        return false;
    }
    
    public String Pedidopdia(DiaTrabalho t){
        String report="";
        for(DiaTrabalho p:databaseDiaTrabalho){
            if(p == t){
            report+= "Id: "+ p.getId()+"\n";
            report+= "Listas de Pedidos: "+ p.getDiaPedido()+"\n\n";
            }
        }
        return report;
    }

    public String listAll(){
        String report="";
        for(DiaTrabalho p:databaseDiaTrabalho){
            report+= "Id: "+ p.getId()+"\n";
            report+= "Listas de Pedidos: "+ p.getDiaPedido()+"\n\n";
            
        }
        return report;
    }
    
}
