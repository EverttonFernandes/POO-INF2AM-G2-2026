package Aula061404AssociacaoAgregacaoEComposicao.agregacao;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    // Agregação acontece quando um ou mais produtos se relacionam com o carrinho de compras!
    public void adicionarProduto(Produto produto) {
        this.listaDeProdutos.add(produto);
    }

    public void exibirProdutosDoCarrinho() {
        if (!this.listaDeProdutos.isEmpty()) {
            System.out.println("############# PRODUTOS NO CARRINHO #############");
            for (Produto produto : listaDeProdutos) {
                System.out.println("Nome do produto: " + produto.getNomeDoProduto());
                System.out.println("Preco do produto :" + produto.getPrecoDoProduto());
                System.out.println("Descricao do produto :" + produto.getDescricaoDoProduto());
                System.out.println("---------------------------------------------");
            }
        } else
            System.out.println("O carrinho de compras está vazio!");
    }
}

