package Etapa3;

public class Bijuteria extends Loja {
    private double metaVenda;

    public Bijuteria(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, double metaVenda) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.metaVenda = metaVenda;
    }

    public Bijuteria(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao, double metaVenda) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao);
        this.metaVenda = metaVenda;
    }

    // Metodos Setteres
    public void setMetaVendas(double metaVenda) {
        this.metaVenda = metaVenda;
    }

    // Metodos Getters
    public double getMetaVendas() {
        return metaVenda;
    }

    // Metodos

    @Override
    public String toString() {
        return super.toString() +
                "\nMeta de venda : " + metaVenda;
    }

}
