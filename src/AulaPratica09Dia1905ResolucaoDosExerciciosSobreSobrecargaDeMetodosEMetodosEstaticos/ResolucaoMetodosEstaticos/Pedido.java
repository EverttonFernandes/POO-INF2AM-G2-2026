package AulaPratica09Dia1905ResolucaoDosExerciciosSobreSobrecargaDeMetodosEMetodosEstaticos.ResolucaoMetodosEstaticos;

public class Pedido {
    private Item item;
    private Cliente cliente;

    public Pedido(Item item, Cliente cliente) {
        this.item = item;
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // CONSEGUIMOS CHAMAR O MÉTODO ESTÁTICO DENTRO DO PRÓPRIO PEDIDO SE QUISERMOS!
//    public void exibirInformacoesDoPedido() {
//        Resumo.mostrarResumoDoPedido(this);
//    }
}
