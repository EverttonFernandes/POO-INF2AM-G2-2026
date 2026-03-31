package Aula043103ListaPratica.ListaoPratico.Exe3;

import java.util.ArrayList;

public class Acai {
    private String tamanho;
    private double preco;
    private ArrayList<String> listaDeSabores = new ArrayList<>();

    //List<> é quando a lista é imutavel!
    //ArrayList<> é quando a lista é mutavel!

    public Acai(String tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void inserirSabor(String sabor) {
        this.listaDeSabores.add(sabor);
    }

    public void exibirInformacoes() {
        System.out.println("############### EXIBINDO INFORMAÇÕES DO AÇAÍ ###############");
        System.out.println("Tamanho do açaí: " + this.tamanho);
        System.out.println("Preço do açaí: R$ " + this.preco);
        System.out.println("Nome de cada sabor do açaí: ");
        //for (NA ESQUERDA SEMPRE VAI FICAR O DADO ATUAL : NA DIREITA SEMPRE VAI FICAR A TUA LISTA)
        for (String saborAtual : this.listaDeSabores) {
            System.out.println("- Nome do sabor: " + saborAtual);
        }
    }
}
