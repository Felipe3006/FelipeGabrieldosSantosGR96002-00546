package Etapa1;

public class Loja {
    private String nome;
    private int quantidadeFuncionario;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionario, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = -1;
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

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nQuantidade de Funcionários: " + quantidadeFuncionario +
                "\nSalário Base dos Funcionários: " + salarioBaseFuncionario;
    }
}
