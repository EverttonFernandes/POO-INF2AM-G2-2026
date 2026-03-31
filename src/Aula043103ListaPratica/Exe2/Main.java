package Aula043103ListaPratica.Exe2;

public class Main {
    public static void main(String[] args) {
        Produto playstation5 = new Produto("PlayStation 5", 5000.00, "Eletrônicos");
        Produto notebook = new Produto("Notebook", 6000.00, "Eletrônicos");

        playstation5.exibirInformacoes();
        notebook.exibirInformacoes();

        notebook.setPreco(4500.00);
        System.out.println("MOSTRANDO INFORMAÇÕES DO NOTEBOOK APÓS A ALTERAÇÃO DO PREÇO");
        notebook.exibirInformacoes();
    }
}
