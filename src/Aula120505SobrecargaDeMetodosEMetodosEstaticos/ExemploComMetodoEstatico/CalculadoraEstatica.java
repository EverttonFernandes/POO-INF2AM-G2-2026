package Aula120505SobrecargaDeMetodosEMetodosEstaticos.ExemploComMetodoEstatico;

public class CalculadoraEstatica {

    public static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int somar(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static Double somar(Double numero1, Double numero2) {
        return numero1 + numero2;
    }

    public static Float somar(Float numero1, Float numero2) {
        return numero1 + numero2;
    }

    public static Integer somar(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

}
