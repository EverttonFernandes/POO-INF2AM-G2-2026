package Aula061404AssociacaoAgregacaoEComposicao.agregacao;

public class Produto {
    private String nomeDoProduto;
    private double precoDoProduto;
    private String descricaoDoProduto;

    public Produto(String nomeDoProduto, double precoDoProduto, String descricaoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }
}
