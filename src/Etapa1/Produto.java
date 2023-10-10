package Etapa1;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Metodos Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodos Getters

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    //Metodos

    @Override
    public String toString(){
        return "O produto " + nome + " custa: " + preco;
    }

}
