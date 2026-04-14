package Aula061404AssociacaoAgregacaoEComposicao.composicao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bola bola = new Bola("Adidas", "Jabulani");
        TimeDeFutebol gremio = new TimeDeFutebol("Gremio");
        TimeDeFutebol inter = new TimeDeFutebol("Inter");

        ArrayList<TimeDeFutebol> timesParticipantes = new ArrayList<>();
        timesParticipantes.add(gremio);
        timesParticipantes.add(inter);

        PartidaDeFutebol partidaDeFutebol = new PartidaDeFutebol(bola, timesParticipantes);
        partidaDeFutebol.validaQuantidadeDeTimesParticipantes();
        partidaDeFutebol.exibirDetalhesDaPartidaDeFutebol();
    }
}
