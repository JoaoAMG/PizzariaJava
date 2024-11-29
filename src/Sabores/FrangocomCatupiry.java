package Sabores;

import pizzaria.Pizza;

public class FrangocomCatupiry extends Pizza {
    private static final String INGREDIENTES = "Frango,Catupiry,Molho de tomate";

    public FrangocomCatupiry(String tamanho, Double preco, String borda) {
        super(tamanho, preco, borda);
    }

    @Override
    public  String getIngredientes() {
        return INGREDIENTES;
    }
}
