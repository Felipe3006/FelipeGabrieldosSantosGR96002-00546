package Etapa3;

public class Produto {
    private String nome;
    private double preco;
    private Data DataValidade;

    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.DataValidade = dataDeValidade;
    }

    // Metodos Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.DataValidade = dataDeValidade;
    }

    // Metodos Getters

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public Data getDataValidade() {
        return DataValidade;
    }

    // Metodos

    @Override
    public String toString() {
        return "O produto " + nome + " custa: " + preco;
    }

    public boolean estaVencido(Data dataRecebida){
        if(dataRecebida.getAno() <= DataValidade.getAno()){
            if(dataRecebida.getMes() <= DataValidade.getMes()){
                if(dataRecebida.getDia() <= DataValidade.getDia()){
                    return false;
                }
            }
        }
        return true;
    }

}
