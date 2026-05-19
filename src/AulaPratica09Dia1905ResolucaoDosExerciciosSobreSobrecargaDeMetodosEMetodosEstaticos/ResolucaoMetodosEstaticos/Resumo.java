package AulaPratica09Dia1905ResolucaoDosExerciciosSobreSobrecargaDeMetodosEMetodosEstaticos.ResolucaoMetodosEstaticos;

public class Resumo {

    public static void mostrarResumoDoPedido(Pedido pedido) {
        System.out.println("MOSTRANDO RESUMO DO PEDIDO");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Item: " + pedido.getItem().getNomeDoItem());
        System.out.println("Preço: " + pedido.getItem().getPreco());
        System.out.println("Obrigado pela sua preferencia!");
    }
}
