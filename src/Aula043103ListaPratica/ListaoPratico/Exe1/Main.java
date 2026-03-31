package Aula043103ListaPratica.ListaoPratico.Exe1;


public class Main {
    public static void main(String[] args) {
        Produto playstation5 = new Produto("PlayStation 5", 5000.00, 10);
        Produto notebook = new Produto("Notebook", 6000.00, 0);

        playstation5.exibirInformacoesDoProduto();
        notebook.exibirInformacoesDoProduto();
    }
}
