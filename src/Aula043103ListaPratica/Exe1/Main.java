package Aula043103ListaPratica.Exe1;

public class Main {
    public static void main(String[] args) {
        Filme osVingadores = new Filme("Os Vingadores", 2012, true);
        Filme senhorDosAneis = new Filme("Senhor dos aneis", 2001, false);

        osVingadores.exibirInformacoesDoFilme();
        senhorDosAneis.exibirInformacoesDoFilme();
    }
}
