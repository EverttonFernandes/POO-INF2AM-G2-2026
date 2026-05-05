package Aula070505ResolucaoExercicioComputadoresEAlunos;

import java.util.ArrayList;

public class Computador {
    private String modelo;
    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public Computador(String modelo) {
        this.modelo = modelo;
    }

    // Aqui temos uma agregação!
    public void adicionarAluno(Aluno aluno) {
        if (this.listaDeAlunos.size() >= 2) {
            System.out.println("Não é possível adicionar mais alunos ao computador, pois o limite de uso é que apenas 2 alunos poderão utiliza-lo!");
        } else {
            listaDeAlunos.add(aluno);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public int quantidadeDeAlunos() {
        return this.listaDeAlunos.size();
    }

    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }
}
