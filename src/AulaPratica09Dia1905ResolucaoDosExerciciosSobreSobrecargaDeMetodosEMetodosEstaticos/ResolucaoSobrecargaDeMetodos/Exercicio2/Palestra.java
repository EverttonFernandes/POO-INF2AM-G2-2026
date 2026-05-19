package AulaPratica09Dia1905ResolucaoDosExerciciosSobreSobrecargaDeMetodosEMetodosEstaticos.ResolucaoSobrecargaDeMetodos.Exercicio2;

public class Palestra {
    private String assunto;
    private String palestrante;
    private String dataDoEvento;
    private boolean possuiBrinde;

    public Palestra(String assunto, String palestrante, String dataDoEvento, boolean possuiBrinde) {
        this.assunto = assunto;
        this.palestrante = palestrante;
        this.dataDoEvento = dataDoEvento;
        this.possuiBrinde = possuiBrinde;
    }

    public Palestra(String assunto, String palestrante, String dataDoEvento) {
        this.assunto = assunto;
        this.palestrante = palestrante;
        this.dataDoEvento = dataDoEvento;
    }

    public Palestra(String assunto, String palestrante) {
        this.assunto = assunto;
        this.palestrante = palestrante;
    }

    public Palestra(String assunto) {
        this.assunto = assunto;
    }

    public void exibirInformacoes() {
        System.out.println("################# EXIBINDO INFORMAÇÕES #################");
        System.out.println("Assunto da Palestra: " + assunto);
        System.out.println("Palestrante: " + palestrante);
        System.out.println("Data do Evento: " + dataDoEvento);

        if (this.possuiBrinde) {
            System.out.println("A palestra possui brinde!");
        } else {
            System.out.println("A palestra não possui brinde!");
        }
    }
}
