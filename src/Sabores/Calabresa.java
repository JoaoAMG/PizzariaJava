package Sabores;
import pizzaria.Pizza;

    public class Calabresa extends Pizza {
    private static final String INGREDIENTES = "Mussarela, Calabresa, Cebola";
    private static final String NOME = "Calabresa";

    public Calabresa(String tamanho, Double preco, String borda) {
        super(tamanho, preco, borda);
    }

    @Override
    public  String getIngredientes() {
        return INGREDIENTES;
    }
    
    @Override
    public  String getNome() {
        return NOME;
    }
        
    
 
}
    
