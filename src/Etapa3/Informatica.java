package Etapa3;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao,
            double seguroEletronicos) {
        super(nome, quantidadeFuncionario, endereco, dataDeFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Metodos Setters
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Metodos Getters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString() +
                "\nValor do seguro: " + seguroEletronicos;
    }
}
