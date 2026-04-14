package Aula050704ResolucaoDosExercicios.Exercicio3;

import java.util.ArrayList;

public class PlayList {
    private String nomeDaPlayList;
    private ArrayList<String> listaDeMusicasDaPlayList = new ArrayList<>();

    public PlayList(String nomeDaPlayList) {
        this.nomeDaPlayList = nomeDaPlayList;
    }

    public void adicionarMusicaNaPlayList(String musicaASerAdicionadaNaPlaylist) {
        this.listaDeMusicasDaPlayList.add(musicaASerAdicionadaNaPlaylist);
    }

    public void removerMusicaDaPlayList(String musicaASerRemovidaDaPlaylist) {
        // ESSA LÓGICA É MAIS COMPLEXA, PORÉM GARANTE QUE CONSEGUIMOS ENCONTRAR A MUSICA NA PLAYLIST E REMOVER COM SUCESSO!
        boolean encontrouAMusicaASerRemovidaDaPlayList = false;

        for (int indice = 1; indice < this.listaDeMusicasDaPlayList.size(); indice++) {
            if (musicaASerRemovidaDaPlaylist.equals(this.listaDeMusicasDaPlayList.get(indice))) {
                this.listaDeMusicasDaPlayList.remove(indice);
                encontrouAMusicaASerRemovidaDaPlayList = true;
                System.out.println("A musica " + musicaASerRemovidaDaPlaylist + " foi removida da playlist " + this.nomeDaPlayList);
                break;
            }
        }

        if (encontrouAMusicaASerRemovidaDaPlayList == false) {
            System.out.println("A musica " + musicaASerRemovidaDaPlaylist + " não foi encontrada na playlist " + this.nomeDaPlayList);
        }

        // Jeito mais simples de remover, porém SEM NENHUMA VALIDAÇÃO (SEM TER A CERTEZA QUE A MUSICA EXISTE E FOI REMOVIDA DA PLAYLIST)
        this.listaDeMusicasDaPlayList.remove(musicaASerRemovidaDaPlaylist);
    }


    public void exibirDetalhesDaPlayList() {
        System.out.println("######### DETALHES DA PLAYLIST #########");
        System.out.println("Nome da playlist: " + this.nomeDaPlayList);
        System.out.println("Musicas da playlist: ");

        for (String musicaAtual : this.listaDeMusicasDaPlayList) {
            System.out.println("- " + musicaAtual);
        }

    }

}
