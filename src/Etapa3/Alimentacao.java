package Etapa3;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao,
            Data dataAlvara) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao);
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
                "\nData que a loja recebeu seu alvara:  : " + dataAlvara.toString();
    }
}
