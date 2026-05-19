package AulaPratica09Dia1905ResolucaoDosExerciciosSobreSobrecargaDeMetodosEMetodosEstaticos.ResolucaoSobrecargaDeMetodos.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Laboratorio laboratorio16 = new Laboratorio("Laboratorio 16", 20);
        laboratorio16.exibirInformacoes();

        Laboratorio laboratorio17 = new Laboratorio("Laboratorio 17", 20, true);
        laboratorio17.exibirInformacoes();
    }
}
