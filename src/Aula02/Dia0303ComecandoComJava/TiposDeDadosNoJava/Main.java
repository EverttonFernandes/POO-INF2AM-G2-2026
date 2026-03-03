package Aula02.Dia0303ComecandoComJava.TiposDeDadosNoJava;

public class Main {
    public static void main(String[] args) {
        // Tipos de dados no Java
        // String - para texto, frases, palavras, nomes, mensagens, etc
        String nome = "João";

        // int para números inteiros, sem casas decimais
        int idade = 25;
        // double para números com casas decimais
        double altura = 1.75;
        // float para números com casas decimais, mas com menos precisão que o double
        float valor = 100.f; // muito usado em valores monetarios (dinheiro)

        // boolean para valores verdadeiros ou falsos
        boolean estaLigado = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Valor: " + valor);
        System.out.println("Está ligado? " + estaLigado);
    }
}
