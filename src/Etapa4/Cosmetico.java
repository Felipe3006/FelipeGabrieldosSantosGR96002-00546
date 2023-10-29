package Etapa4;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, int quantidadeProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeProdutos,
            double taxaComercializacao) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao,quantidadeProdutos);
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
