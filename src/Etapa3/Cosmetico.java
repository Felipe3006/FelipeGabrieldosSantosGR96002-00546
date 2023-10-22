package Etapa3;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao,
            double taxaComercializacao) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Metodos Setters
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Metodos Getters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    // Metodos

    @Override
    public String toString() {
        return super.toString() +
        "\nTaxa de comercialização: " + taxaComercializacao;
    }
}
