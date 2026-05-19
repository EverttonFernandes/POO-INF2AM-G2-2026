package AulaPratica09Dia1905ResolucaoDosExerciciosSobreSobrecargaDeMetodosEMetodosEstaticos.ResolucaoSobrecargaDeMetodos.Exercicio1;

public class Laboratorio {
    private String nome;
    private int numeroDeComputadores;
    private boolean temAcessoInternet;

    public Laboratorio(String nome) {
        this.nome = nome;
    }

    public Laboratorio(String nome, int numeroDeComputadores) {
        this.nome = nome;
        this.numeroDeComputadores = numeroDeComputadores;
    }

    public Laboratorio(String nome, int numeroDeComputadores, boolean temAcessoInternet) {
        this.nome = nome;
        this.numeroDeComputadores = numeroDeComputadores;
        this.temAcessoInternet = temAcessoInternet;
    }

    public void exibirInformacoes() {
        System.out.println("################# EXIBINDO INFORMAÇÕES #################");
        System.out.println("Nome do Laboratório: " + nome);
        System.out.println("Número de Computadores: " + numeroDeComputadores);

        if (this.temAcessoInternet) {
            System.out.println("O laboratorio possui acesso a internet!");
        } else {
            System.out.println("O laboratorio não possui acesso a internet!");
        }
    }
}
