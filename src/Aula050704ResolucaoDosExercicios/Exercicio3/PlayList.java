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
        // MANEIRA MAIS MANUAL DE REMOVER UMA MUSICA DE UMA LISTA DE MUSICAS!
        for (int indice = 1; indice <= this.listaDeMusicasDaPlayList.size(); indice++) {
            if (musicaASerRemovidaDaPlaylist.equals(this.listaDeMusicasDaPlayList.get(indice))) {
                this.listaDeMusicasDaPlayList.remove(indice);
            }
        }

        // MANEIRA MAIS SIMPLES DE REMOVER UMA MUSICA DE UMA LISTA DE MUSICAS!
        this.listaDeMusicasDaPlayList.remove(musicaASerRemovidaDaPlaylist);
    }

}
