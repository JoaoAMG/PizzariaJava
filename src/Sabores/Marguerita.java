package Sabores;

import pizzaria.Pizza;

public class Marguerita extends Pizza {
    private static final String INGREDIENTES = "Mussarela,Manjericão,tomate,Molho de tomate";
    private static final String NOME = "Marguerita";
    public Marguerita(String tamanho, Double preco, String borda) {
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