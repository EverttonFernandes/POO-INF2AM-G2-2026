package AulaPratica09Dia1905ResolucaoDosExerciciosSobreSobrecargaDeMetodosEMetodosEstaticos.ResolucaoMetodosEstaticos;

public class Item {
    private double preco;
    private String nomeDoItem;

    public Item(double preco, String nomeDoItem) {
        this.preco = preco;
        this.nomeDoItem = nomeDoItem;
    }

    public double getPreco() {
        return preco;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }
}
