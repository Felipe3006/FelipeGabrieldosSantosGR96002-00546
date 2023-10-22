package Etapa2;

import Teclado.Teclado;

public class Principal {
    public static void main(String[] args) throws Exception {
        var Loop = true;
        while (Loop == true) {
            System.out.println("(1)cria uma loja\n(2)cria um produto\n(3)sair");
            var escolha = Teclado.leInt("Digite o número correspondente a sua escolha: ");
            if (escolha == 1) {

                Loja loja = new Loja(Teclado.leString("Digite o nome da Loja"),
                        Teclado.leInt("Qual a quantidade de funcionários?: "),
                        new Endereco(Teclado.leString("Qual é a rua que se localiza a loja?: "),
                                Teclado.leString("Qual é a cidade que se localiza a loja?: "),
                                Teclado.leString("Qual é o estado que se localiza a loja?: "),
                                "Qual é o país que se localiza a loja?: ",
                                Teclado.leString("Digite o cep da cidade: "),
                                Teclado.leString("Digite o número que se localiza a loja: "),
                                Teclado.leString("Digite o complemento: ")),
                        new Data(Teclado.leInt("Digite o dia da data de fundação: "),
                                Teclado.leInt("Digite o mes da data de fundação: "),
                                Teclado.leInt("Digite o ano da data de fundação: ")));

            } else if (escolha == 2) {

                Produto produto = new Produto(Teclado.leString("Digite o nome do produto: "),
                        Teclado.leDouble("Digite o preço do produto: "),
                        new Data(Teclado.leInt("Digite o dia da data de vencimento: "),
                                Teclado.leInt("Digite o mes da data de vencimento: "),
                                Teclado.leInt("Digite o ano da data de vencimento: ")));
                if (produto.estaVencido(new Data(20, 10, 2023))) {
                    System.out.println("Está vencido");
                } else {
                    System.out.println("Não está vencido");
                }

            } else if (escolha == 3) {
                System.err.println("Saindo...");
                Loop = false;
            } else {
                System.out.println("Opção invalida");
                System.out.println(" ");
            }
        }
    }
}
