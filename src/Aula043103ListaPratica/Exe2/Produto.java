package Aula043103ListaPratica.Exe2;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("############### EXIBINDO INFORMAÇÕES DO PRODUTO ###############");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: R$ " + preco);
        System.out.println("Categoria do produto: " + categoria);
    }
}
