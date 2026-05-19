package AulaPratica09Dia1905ResolucaoDosExerciciosSobreSobrecargaDeMetodosEMetodosEstaticos.ResolucaoMetodosEstaticos;

public class Main {
    public static void main(String[] args) {
        Item item = new Item(90.0, "Mouse");
        Cliente cliente = new Cliente("Fulano");

        Pedido pedido = new Pedido(item, cliente);

//        pedido.exibirInformacoesDoPedido();
        // CONSEGUIMOS TAMBÉM CHAMAR O MÉTODO ESTÁTICO DIRETAMENTE DENTRO DA MAIN (SE QUISERMOS!)
        Resumo.mostrarResumoDoPedido(pedido);
    }
}
