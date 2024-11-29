package Sabores;

import pizzaria.Pizza;

public class Marguerita extends Pizza {
    private static final String INGREDIENTES = "Mussarela,Manjericão,tomate,Molho de tomate";

    public Marguerita(String tamanho, Double preco, String borda) {
        super(tamanho, preco, borda);
    }

    @Override
    public  String getIngredientes() {
        return INGREDIENTES;
    }
}