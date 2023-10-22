package Etapa3;

public class Vestuario extends Loja {
    private Boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, Boolean produtosImportados) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao,
            Boolean produtosImportados) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao);
        this.produtosImportados = produtosImportados;
    }

    // Metodos Setters
    public void setProdutosImportados(Boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Metodos Getters
    public Boolean getProdutosImportados() {
        return produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nA loja vende produtos importados? : " + produtosImportados;
    }

}
