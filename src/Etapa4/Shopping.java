package Etapa4;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja lojas[];

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    // Metodos Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Metodos Getters

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // Metodos

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null){
                if (lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                    lojas[i] = null;
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoDeLoja) {
        if (tipoDeLoja.equalsIgnoreCase("Cosmetico") || tipoDeLoja.equalsIgnoreCase("Vestuario")
                || tipoDeLoja.equalsIgnoreCase("Bijuteria")
                || tipoDeLoja.equalsIgnoreCase("Alimentacao") || tipoDeLoja.equalsIgnoreCase("informatica")) {
            int quantidade = 0;
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] instanceof Cosmetico && tipoDeLoja.equalsIgnoreCase("Cosmetico")) {
                    quantidade++;
                } else if (lojas[i] instanceof Vestuario && tipoDeLoja.equalsIgnoreCase("Vestuario")) {
                    quantidade++;
                } else if (lojas[i] instanceof Bijuteria && tipoDeLoja.equalsIgnoreCase("Bijuteria")) {
                    quantidade++;
                } else if (lojas[i] instanceof Alimentacao && tipoDeLoja.equalsIgnoreCase("Alimentacao")) {
                    quantidade++;
                } else if (lojas[i] instanceof Informatica && tipoDeLoja.equalsIgnoreCase("Informatica")) {
                    quantidade++;
                }
            }
            return quantidade;
        } else {
            return -1;
        }

    }

    public Informatica lojaSeguroMaisCaro(){
        double valor = 0;
        Informatica nomeLoja = null;
        for (int i = 0; i < lojas.length; i++) {
            if(lojas[i] instanceof Informatica){
               Informatica lojaInformatica = (Informatica) lojas[i];
               if(lojaInformatica.getSeguroEletronicos() > valor){
                valor = lojaInformatica.getSeguroEletronicos();
                nomeLoja = lojaInformatica;
               }
            }
        }
        if(nomeLoja == null){
            return null;
        }else{
            return nomeLoja;
        }
        
    }

    @Override
    public String toString() {
        return "O Shopping " + nome + " está localizado no endereço: " + endereco + " e possui as seguintes lojas:  "
                + "\n" + lojas.toString();
    }
}
