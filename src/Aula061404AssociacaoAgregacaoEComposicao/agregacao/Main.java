package Aula061404AssociacaoAgregacaoEComposicao.agregacao;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Produto playtation5 = new Produto("Playstation 5", 5000.00, "Console de videogame da Sony");
        Produto notebook = new Produto("Notebook", 3000.00, "Computador portátil para trabalho e estudos");
        carrinhoDeCompras.adicionarProduto(playtation5);
        carrinhoDeCompras.adicionarProduto(notebook);

        carrinhoDeCompras.exibirProdutosDoCarrinho();
    }
}
