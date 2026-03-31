package Aula043103ListaPratica.Exe1;

public class Filme {
    private String titulo;
    private int anoLancamento;
    private boolean disponivel;

    public Filme(String titulo, int anoLancamento, boolean disponivel) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.disponivel = disponivel;
    }

    // o getter acaba sendo uma função com retorno
    public String getTitulo() {
        return titulo;
    }
    // o setter é uma função sem retorno, server para realizar algo e não retornar nada!


    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void exibirInformacoesDoFilme() {
        if (this.disponivel) {
            System.out.println("Filme " + this.titulo + " está disponível para assistir.");
        } else {
            System.out.println("Filme " + this.titulo + " não está disponível para assistir.");
        }

    }
}
