package AulaPratica10Dia2306ResolucaoDosExerciciosPreparatoriosParaProva.Exercicio6;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String turno;
    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public Turma(String nome) {
        this.nome = nome;
    }

    public Turma(String nome, String turno) {
        this.nome = nome;
        this.turno = turno;
    }

    public Turma(String nome, String turno, ArrayList<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.turno = turno;
        this.listaDeAlunos = listaDeAlunos;
    }

    public void adicionarAluno(Aluno alunoASerAdicionadoNaTurma) {
        boolean duplicou = false;

        for (Aluno aluno : this.listaDeAlunos) {
            if (aluno.getMatricula().equals(alunoASerAdicionadoNaTurma.getMatricula())) {
                System.out.println("ERROR: O(a) aluno(a) + " + alunoASerAdicionadoNaTurma.getNome() + " cuja sua matricula é " + alunoASerAdicionadoNaTurma.getMatricula() + " já consta na lista!");
                duplicou = true;
                break;
            }
        }

        if (!duplicou) {
            this.listaDeAlunos.add(alunoASerAdicionadoNaTurma);
            System.out.println("SUCESSO: O aluno(a) " + alunoASerAdicionadoNaTurma.getNome() + " com a matricula " + alunoASerAdicionadoNaTurma.getMatricula() + " foi adicionado(a) com sucesso na turma!");
        }

    }

    public void listarAlunos() {
        System.out.println("############# ALUNOS DA TURMA #############");
        for (Aluno aluno : this.listaDeAlunos) {
            System.out.println("Nome do(a) aluno(a): " + aluno.getNome());
            System.out.println("Matricula do(a) aluno(a): " + aluno.getMatricula());
            System.out.println("Email do(a) aluno(a): " + aluno.getEmail());
            System.out.println("----------------------------");
        }
    }

    public void mostrarAlunoEspecifico(Aluno aluno) {
        System.out.println("############# MOSTRANDO ALUNO ESPECIFICO #############");

        if (this.listaDeAlunos.contains(aluno)) {
            System.out.println("Nome do(a) aluno(a): " + aluno.getNome());
            System.out.println("Matricula do(a) aluno(a): " + aluno.getMatricula());
            System.out.println("Email do(a) aluno(a): " + aluno.getEmail());
        } else {
            System.out.println("ERROR: O(a) aluno(a) " + aluno.getNome() + " não foi matriculado na turma!");
        }
    }

    public int contarAlunos() {
        return this.listaDeAlunos.size();
    }

    public void removerAlunosDaTurma() {
        this.listaDeAlunos.clear();
//        this.listaDeAlunos.removeAll(this.listaDeAlunos);
        if (this.listaDeAlunos.size() == 0) {
            System.out.println("A turma " + this.nome + " não possui nenhum aluno");
        }
    }

    public void removerAlunoEspecificoDaTurma(Aluno alunoInformado) {
//        if (this.listaDeAlunos.contains(alunoInformado)) {
//            if (this.listaDeAlunos.remove(alunoInformado)) {
//                System.out.println("O(a) aluno " + alunoInformado.getNome() + " foi removido da turma!");
//            }
//        } else {
//            System.out.println("O aluno informado " + alunoInformado.getNome() + " não foi removido porque não consta na turma!");
//        }

        if(this.listaDeAlunos.removeIf(alunoDaLista -> alunoDaLista.equals(alunoInformado))){
            System.out.println("O(a) aluno " + alunoInformado.getNome() + " foi removido da turma!");
        } else {
            System.out.println("O aluno informado " + alunoInformado.getNome() + " não foi removido porque não consta na turma!");
        }
    }
}
