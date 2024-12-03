package pizzaria;

public abstract class Pizza {
    private static int inc = 1;
    private Integer id;
    private String tamanho;
    private Double preco;
    private String borda;
    
   

    public Pizza(String tamanho, Double preco, String borda) {
        this.id = inc++;
        this.tamanho = tamanho;
        this.preco = preco;
        this.borda = borda;
      
    }

    public Integer getId() {
        return id;
    }

    
    
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }
    public abstract String getNome();
    public abstract String getIngredientes();
    @Override
    public String toString() {
        return "Pizza" + getNome() + " \ntamanho: "   + tamanho + "\npreco: " 
                + preco + "\nborda: " + borda + "\ningredientes: " + getIngredientes()+"\n"  ;
    }
    
    // Usar Indice ao inves do Id

    
   
    
    


}
