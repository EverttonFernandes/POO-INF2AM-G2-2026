package Aula061404AssociacaoAgregacaoEComposicao.associacao;

public class Disciplina {
    private String nomeDaDisciplina;
    private Professor professor;

    public Disciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    // AQUI SERIA A NOSSA ASSOCIAÇÃO ENTRE O PROFESSOR E A DISCIPLINA!
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void exibirDetalhesDaDisciplina() {
        System.out.println("############# DETALHES DA DISCIPLINA #############");
        System.out.println("Disciplina: " + nomeDaDisciplina);
        if (this.professor == null) {
            System.out.println("Professor: Não atribuído a disciplina " + this.nomeDaDisciplina);
        } else {
            System.out.println("Professor responsável: " + professor.getNomeDoProfessor());
        }
    }
}
