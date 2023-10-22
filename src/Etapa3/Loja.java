package Etapa3;

public class Loja {
    private String nome;
    private int quantidadeFuncionario;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data DataFundacao;

    public Loja(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.DataFundacao = dataDeFundacao;
    }

    public Loja(String nome, int quantidadeFuncionario,Endereco endereco, Data dataDeFundacao) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.DataFundacao = dataDeFundacao;
    }

    // Metodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.DataFundacao = dataDeFundacao;
    }

    // Metodos Geeters
    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionario;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return DataFundacao;
    }

    // Metodos

    public double gastosComSalario() {
        return quantidadeFuncionario * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionario < 10) {
            return 'P';
        } else if (quantidadeFuncionario >= 10 && quantidadeFuncionario <= 30) {
            return 'M';
        } else
            return 'G';
    }
}
