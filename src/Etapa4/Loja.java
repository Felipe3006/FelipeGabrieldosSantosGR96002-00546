package Etapa4;

public class Loja {
    private String nome;
    private int quantidadeFuncionario;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data DataFundacao;
    private Produto estoqueProdutos[];

    public Loja(String nome, int quantidadeFuncionario, double salarioBaseFuncionario, Endereco endereco,
            Data dataDeFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.DataFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.DataFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
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

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
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

    public void imprimeProdutos() {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                System.out.println("Produto não encontrado");
            } else {
                System.out.println(estoqueProdutos[i]);
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null){
                if (estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                    estoqueProdutos[i] = null;
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    /*public String toString() {
        return "Nome: " + nome +
                "\nQuantidade de Funcionários: " + quantidadeFuncionario +
                "\nSalário Base dos Funcionários: " + salarioBaseFuncionario +
                "\nEndereço da loja" +
                "\nRua: " + endereco.getNomeDaRua() +
                "\nCidade: " + endereco.getCidade() +
                "\nEstado: " + endereco.getEstado() +
                "\nPaís: " + endereco.getPais() +
                "\nCEP: " + endereco.getCep() +
                "\nNúmero: " + endereco.getNumero() +
                "\nComplemento: " + endereco.getComplemento() +
                "\nData de fundaçao: " + DataFundacao.toString() +
                "\nProdutos: " + estoqueProdutos.toString()+"\n";
    }*/

      public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome)
          .append("\nQuantidade de Funcionários: ").append(quantidadeFuncionario)
          .append("\nSalário Base dos Funcionários: ").append(salarioBaseFuncionario)
          .append("\nEndereço da loja\n")
          .append("Rua: ").append(endereco.getNomeDaRua())
          .append("\nCidade: ").append(endereco.getCidade())
          .append("\nEstado: ").append(endereco.getEstado())
          .append("\nPaís: ").append(endereco.getPais())
          .append("\nCEP: ").append(endereco.getCep())
          .append("\nNúmero: ").append(endereco.getNumero())
          .append("\nComplemento: ").append(endereco.getComplemento())
          .append("\nData de fundação: ").append(DataFundacao.toString());

        // Adicionando detalhes dos produtos
        sb.append("\nProdutos:\n");
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                sb.append(produto.toString()).append("\n");
            } else {
                sb.append("Produto não inserido\n");
            }
        }

        return sb.toString();
    }
}
