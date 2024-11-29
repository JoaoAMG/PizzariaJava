/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sabores;

import pizzaria.Pizza;


public class QuatroQueijos extends Pizza {
    private static final String INGREDIENTES = "Provolone,Gongorzola,Mussarela, Parmesão";

    public QuatroQueijos(String tamanho, Double preco, String borda) {
        super(tamanho, preco, borda);
    }

    @Override
    public  String getIngredientes() {
        return INGREDIENTES;
    }
}
    