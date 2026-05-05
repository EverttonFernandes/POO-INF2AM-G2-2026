package Aula070505ResolucaoExercicioComputadoresEAlunos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno maria = new Aluno("Maria", "123456");
        Aluno joao = new Aluno("João", "654321");

        Computador computador1 = new Computador("Dell1");
        Computador computador2 = new Computador("Dell2");

        computador1.adicionarAluno(maria);
        computador1.adicionarAluno(joao);

        ArrayList<Computador> computadoresDoLaboratorio = new ArrayList<>();

        computadoresDoLaboratorio.add(computador1);
        computadoresDoLaboratorio.add(computador2);

        ArCondicionado arCondicionado = new ArCondicionado("LG", "22°C");
        Laboratorio laboratorio = new Laboratorio("Lab1", computadoresDoLaboratorio);

        laboratorio.setArCondicionado(arCondicionado);
        laboratorio.exibirDetalhesLaboratorio();
    }
}
