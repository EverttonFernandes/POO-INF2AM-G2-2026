package Aula061404AssociacaoAgregacaoEComposicao.associacao;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("IA Aplicada");

        Professor professorEverton = new Professor("Everton");
        Professor professorPadilha = new Professor("Padilha");

        disciplina.setProfessor(professorEverton);

        disciplina.exibirDetalhesDaDisciplina();

        disciplina.setProfessor(professorPadilha);

        disciplina.exibirDetalhesDaDisciplina();
    }
}
