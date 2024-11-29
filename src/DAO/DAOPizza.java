package DAO;

import java.util.ArrayList;
import java.util.List;
import pizzaria.Pizza;

public class DAOPizza {
    private List<Pizza> databasePizza= new ArrayList();
    
    public void create(Pizza p) {
        databasePizza.add(p);
    }
    
    public Pizza read(int id) {
        for(Pizza p:databasePizza){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    public boolean update(Pizza p){
        Pizza paux=read(p.getId());
        if(paux!= null){
            paux.setTamanho(p.getTamanho());
            paux.setPreco(p.getPreco());
            paux.setBorda(p.getBorda());
            
            return true;
        }
        return false;
    }
    
    public boolean delete(Pizza p){
         Pizza paux=read(p.getId());
        if(paux!= null){
            databasePizza.remove(p);
            return true;
        }
        return false;
    }

    public String listAll(){
        String report="";
        for(Pizza p:databasePizza){
            report+= "Id: "+ p.getId()+"\n";
            report+= "Tamanho: "+ p.getTamanho()+"\n";
            report+= "Preco: "+ p.getPreco()+"\n";
            report+= "Borda: "+ p.getBorda()+"\n\n";
        }
        return report;
    }
    
}
