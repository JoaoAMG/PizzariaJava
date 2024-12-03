package DAO;

import java.util.ArrayList;
import java.util.List;
import pizzaria.Cliente;

public class DAOCliente {
    private List<Cliente> databaseCliente= new ArrayList();

   
    
    
    public void create(Cliente p) {
        databaseCliente.add(p);
    }
    
    public Cliente read(int id) {
        for(Cliente p:databaseCliente){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    public boolean update(Cliente p){
        Cliente paux=read(p.getId());
        if(paux!= null){
            paux.setNome(p.getNome());
            paux.setRua(p.getRua());
            paux.setBairro(p.getBairro());
            paux.setNumero(p.getNumero());
            paux.setCidade(p.getCidade());
            
            return true;
        }
        return false;
    }
    
    public boolean delete(Cliente p){
         Cliente paux=read(p.getId());
        if(paux!= null){
            databaseCliente.remove(p);
            return true;
        }
        return false;
    }

    public String listAll(){
        String report="";
        for(Cliente p:databaseCliente){
            report+= "\n\nId: "+ p.getId()+"\n";
            report+= "Nome: "+ p.getNome()+"\n";
            report+= "Rua: "+ p.getRua()+"\n";
            report+= "Bairro: "+ p.getBairro()+"\n";
            report+= "Numero: "+ p.getNumero()+"\n";
            report+= "Cidade: "+ p.getCidade()+"\n\n";
        }
        return report;
    }
    
}
