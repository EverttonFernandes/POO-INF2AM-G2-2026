package Aula050704ResolucaoDosExercicios.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do lanche:");
        String nomeDoLanche = scanner.nextLine();

        System.out.println("Digite o preço do lanche:");
        double precoDoLanche = scanner.nextDouble();

        scanner.nextLine(); // Limpar o buffer (removendo a tecla ENTER)

        Lanche lanche = new Lanche(nomeDoLanche, precoDoLanche);

        for (int indice = 1; indice <= 4; indice++) {
            System.out.println("Informe o ingrediente " + indice + " para ser adicionado ao lanche:");
            String ingredienteInformadoPeloUsuario = scanner.nextLine();
            lanche.adicionarIngrediente(ingredienteInformadoPeloUsuario);
        }

        lanche.exibirDetalhesDoLanche();
        scanner.close();
    }
}

