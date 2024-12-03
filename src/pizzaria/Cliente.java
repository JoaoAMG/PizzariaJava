/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria;

/**
 *
 * @author aluno
 */
public class Cliente {
    private static int inc = 1;
    private Integer id ;
    private String nome;
    private String rua;
    private String bairro;
    private Integer numero;
    private String cidade;

    public Cliente(String nome,String rua, String bairro, Integer numero, String cidade) {
        this.id = inc++;
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        
    }

    public Integer getId() {
        return id;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "id: " + getId() + "\nNome cliente: " + nome + "\nEndereco\n" + "rua:" + rua + "\nbairro:" + bairro + ",\nnumero:" + numero + "\n cidade:" + cidade +"\n";
    }
    
    
}
