package Aula043103ListaPratica.ListaoPratico.Exe1;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibirInformacoesDoProduto(){
        System.out.println("############### EXIBINDO INFORMAÇÕES DO PRODUTO ###############");
        if(this.quantidade > 0){
            System.out.println("O produto " + this.nome + " está disponível por R$ " + this.preco);
        } else {
            System.out.println("O produto " + this.nome + " está indisponível no momento.");
        }
    }
}
