package Etapa4;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, Data dataAlvara, int quantidadeProdutos) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao,
            int quantidadeProdutos,
            Data dataAlvara) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Metodos Setters
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Metodos Getters
    public Data getDataAlvara() {
        return dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Data que a loja recebeu seu alvara:  : " + dataAlvara.toString() + "\n";
    }
}
