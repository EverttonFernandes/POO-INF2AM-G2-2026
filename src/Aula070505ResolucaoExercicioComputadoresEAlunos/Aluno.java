package Aula070505ResolucaoExercicioComputadoresEAlunos;

public class Aluno {
    private String nome;
    private String matricula;
    private int cpf;
    private String rg;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Aluno(String nome, String matricula, int cpf, String rg) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
