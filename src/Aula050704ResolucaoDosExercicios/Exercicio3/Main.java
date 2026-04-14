package Aula050704ResolucaoDosExercicios.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da sua playlist: ");
        String nomeDaPlayList = scanner.nextLine();

        System.out.println("Informe a quantidade de musicas que tu deseja colocar na tua playlist: ");
        int quantidadeDeMusicasASeremAdicionadasNaPlayList = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer do teclado

        PlayList playList = new PlayList(nomeDaPlayList);

        for (int indice = 1; indice <= quantidadeDeMusicasASeremAdicionadasNaPlayList; indice++) {
            System.out.println("Informe a musica " + indice + " que tu deseja adicionar na tua playlist: ");
            String musicaInformada = scanner.nextLine();
            playList.adicionarMusicaNaPlayList(musicaInformada);
        }

        playList.exibirDetalhesDaPlayList();

        System.out.println("Informe uma musica que tu deseja remover da tua playlist: ");
        String musicaASerRemovidaDaPlayList = scanner.nextLine();
        playList.removerMusicaDaPlayList(musicaASerRemovidaDaPlayList);
        playList.exibirDetalhesDaPlayList();
    }
}
