package Aula01.Dia2402IntroducaoAoPOO;


public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindos alunos da INF2AN a disciplina de POO!");
        System.out.println("Vamos criar nosso primeiro objeto em POO, um carro!");

        Carro tida = new Carro("Vermelho", 100, 4, "Motor V8", "Tida");

        System.out.println("O carro criado tem as seguintes características:");
        System.out.println("Cor: " + tida.cor);
        System.out.println("Quantidade de gasolina: " + tida.quantidadeDeGasolina);
        System.out.println("Quantidade de portas: " + tida.quantidadeDePortas);
        System.out.println("Motor: " + tida.motor);

        System.out.println("Vamos criar outro carro!");

        Carro onix = new Carro("Preto", 50, 4, "Motor V6", "Onix");

        System.out.println("O carro criado tem as seguintes características:");
        System.out.println("Cor: " + onix.cor);
        System.out.println("Quantidade de gasolina: " + onix.quantidadeDeGasolina);
        System.out.println("Quantidade de portas: " + onix.quantidadeDePortas);
        System.out.println("Motor: " + onix.motor);
    }
}