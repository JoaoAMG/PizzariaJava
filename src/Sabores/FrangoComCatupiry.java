package Sabores;

import pizzaria.Pizza;

public class FrangoComCatupiry extends Pizza {
    private static final String INGREDIENTES = "Frango,Catupiry,Molho de tomate";
    private static final String NOME = "Frango com Catupriy";
    public FrangoComCatupiry(String tamanho, Double preco, String borda) {
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
