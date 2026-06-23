package AulaPratica10Dia2306ResolucaoDosExerciciosPreparatoriosParaProva.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Aluno lara = new Aluno("Lara", "1234laraifsul", "lara@ifsul.edu.br");
        Aluno murilo = new Aluno("Murilo", "1234muriloifsul", "murilo@ifsul.edu.br");
        Aluno pedro = new Aluno("Pedro", "1234pedroifsul", "pedro@ifsul.edu.br");
        Aluno sophiaAbreu = new Aluno("Sophia Abreu", "1234sophiafsul", "sophia@ifsul.edu.br");
        Aluno sophiaPereira = new Aluno("Sophia Pereira", "1234sophiafsul", "sophia@ifsul.edu.br");

        Turma turma = new Turma("INF2AM-G2", "Manhã");

        turma.adicionarAluno(lara);
        turma.adicionarAluno(murilo);
        turma.adicionarAluno(pedro);
        turma.adicionarAluno(sophiaAbreu);
        turma.adicionarAluno(sophiaPereira);

        turma.listarAlunos();
        turma.mostrarAlunoEspecifico(pedro);

//        turma.removerAlunosDaTurma(); // COMENTADO PARA NÃO DEIXAR A LISTA DE ALUNOS VAZIA/LIMPA!
        System.out.println("A turma possui " + turma.contarAlunos() + " alunos no total");

        turma.removerAlunoEspecificoDaTurma(sophiaPereira);
    }
}
