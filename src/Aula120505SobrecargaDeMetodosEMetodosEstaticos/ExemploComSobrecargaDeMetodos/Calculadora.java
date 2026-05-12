package Aula120505SobrecargaDeMetodosEMetodosEstaticos.ExemploComSobrecargaDeMetodos;

public class Calculadora {

    public int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int somar(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public Double somar(Double numero1, Double numero2) {
        return numero1 + numero2;
    }

    public Float somar(Float numero1, Float numero2) {
        return numero1 + numero2;
    }

    public Integer somar(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

}
