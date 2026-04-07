package Aula050704ResolucaoDosExercicios.Exercicio1;

import java.util.ArrayList;

public class Lanche {
    private String nomeDoLanche;
    private double precoDoLanche;
    private ArrayList<String> listaDeIngredientes = new ArrayList<>();

    public Lanche(String nomeDoLanche, double precoDoLanche) {
        this.nomeDoLanche = nomeDoLanche;
        this.precoDoLanche = precoDoLanche;
    }

    public void adicionarIngrediente(String ingredientInformadoPeloUsuario) {
        this.listaDeIngredientes.add(ingredientInformadoPeloUsuario);
    }

    public void exibirDetalhesDoLanche() {
        System.out.println("############################# MOSTRANDO DETALHES DO LANCHE #############################");
        System.out.println("O nome do lanche é: " + this.nomeDoLanche);
        System.out.println("O preço do lanche é R$: " + this.precoDoLanche);
        System.out.println("Os ingredientes do lanche são: ");

        for(String ingredienteAtualDaLista : this.listaDeIngredientes){
            System.out.println("- : " + ingredienteAtualDaLista);
        }

    }
}
