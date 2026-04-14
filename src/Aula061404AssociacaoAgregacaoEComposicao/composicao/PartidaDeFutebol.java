package Aula061404AssociacaoAgregacaoEComposicao.composicao;

import java.util.ArrayList;

public class PartidaDeFutebol {
    private Bola bola;
    private ArrayList<TimeDeFutebol> timesParticipantes = new ArrayList<>();

    // QUANDO DIZEMOS EXPLICITAMENTE NO CONSTRUTOR QUE O OBJETO A SER CRIADO PRECISA MANDATORIAMENTE DO OUTRO
    // ESTAMOS FAZENDO UMA COMPOSIÇÃO!
    public PartidaDeFutebol(Bola bola, ArrayList<TimeDeFutebol> timesParticipantes) {
        this.bola = bola;
        this.timesParticipantes = timesParticipantes;
    }

    public void validaQuantidadeDeTimesParticipantes() {
        if (timesParticipantes.size() != 2) {
            System.out.println("A quantidade de times participantes deve ser exatamente 2!");
        }
    }

    public void exibirDetalhesDaPartidaDeFutebol() {
        System.out.println("############ DETALHES DA PARTIDA DE FUTEBOL ############");
        System.out.println("Bola utilizada: " + bola.getNomeDaBola() + " da marca " + bola.getMarcaDaBola());
        System.out.println("Times participantes: " + timesParticipantes.get(0).getNomeDoTime() + " e " + timesParticipantes.get(1).getNomeDoTime());
    }
}
