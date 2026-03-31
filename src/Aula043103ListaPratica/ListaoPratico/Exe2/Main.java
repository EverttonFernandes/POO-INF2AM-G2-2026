package Aula043103ListaPratica.ListaoPratico.Exe2;

public class Main {
    public static void main(String[] args) {
        Aluno mariazinha = new Aluno("Mariazinha", 8.5, 9.0);
        Aluno joaozinho = new Aluno("Joãozinho", 10.0, 7.5);
        Aluno pedrinho = new Aluno("Pedrinho", 4.0, 5.0);

        mariazinha.calcularMediaFinal();
        joaozinho.calcularMediaFinal();
        pedrinho.calcularMediaFinal();
    }
}
