import Etapa4.Vestuario;
import Etapa4.Bijuteria;
import Etapa4.Cosmetico;
import Etapa4.Data;
import Etapa4.Informatica;
import Etapa4.Loja;
import Etapa4.Produto;
import Etapa4.Shopping;

public class App {
    public static void main(String[] args) throws Exception {
        Shopping s = new Shopping("Felipao", null, 2);
        s.insereLoja(new Informatica("loja-1", 0, 0, null, null, 0, 563));
        s.insereLoja(new Informatica("loja-22", 0, 0, null, null, 0, 56));

        System.out.println(s.lojaSeguroMaisCaro());
    }
}
