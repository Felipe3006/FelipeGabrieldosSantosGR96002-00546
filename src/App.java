import Etapa4.Vestuario;
import Etapa4.Endereco;
import Etapa4.Alimentacao;
import Etapa4.Bijuteria;
import Etapa4.Cosmetico;
import Etapa4.Data;
import Etapa4.Informatica;
import Etapa4.Loja;
import Etapa4.Produto;
import Etapa4.Shopping;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco e = new Endereco("padrao", "padrao", "padrao", "padrao", "padrao", "56", "padrao");
        Data df = new Data(5, 10, 1995);
       
       
        Shopping s = new Shopping("Felipao", e, 2);
        s.insereLoja(new Informatica("loja-1", 0, 0, e, df, 0, 563));
        s.insereLoja(new Alimentacao("MC Donalts", 10, e, df, 2, df));
        
        s.getLojas()[1].setSalarioBaseFuncionario(15000);
        s.getLojas()[1].insereProduto(new Produto("Pão salgado", 15, df));
         s.getLojas()[1].insereProduto(new Produto("Pão doce", 150, df));
       for(int i = 0; i < s.getLojas().length; i++){
        System.out.println(s.getLojas()[i]);
        //s.getLojas()[i].imprimeProdutos();
       }
    }
}
