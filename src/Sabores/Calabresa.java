package Sabores;
import java.util.Scanner;
import pizzaria.Pizza;

    public class Calabresa extends Pizza {
    private static final String INGREDIENTES = "Mussarela, Calabresa, Cebola";

    public Calabresa(String tamanho, Double preco, String borda) {
        super(tamanho, preco, borda);
    }

    @Override
    public  String getIngredientes() {
        return INGREDIENTES;
    }
        
    
 
}
    
