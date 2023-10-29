package Etapa4;

public class Vestuario extends Loja {
    private Boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao,  Boolean produtosImportados, int quantidadeProdutos) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao,
            int quantidadeProdutos,
            Boolean produtosImportados) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
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
