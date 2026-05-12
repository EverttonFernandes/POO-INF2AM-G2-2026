package Aula120505SobrecargaDeMetodosEMetodosEstaticos.ExemploComSobrecargaDeMetodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(5, 5));
        System.out.println(calculadora.somar(5.0f, 5.0f));
        System.out.println(calculadora.somar(5.0, 5.0));
    }
}
