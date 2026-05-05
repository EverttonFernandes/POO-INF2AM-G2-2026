package Aula070505ResolucaoExercicioComputadoresEAlunos;

import java.util.ArrayList;

public class Laboratorio {
    private String nomeLaboratorio;
    private ArCondicionado arCondicionado;
    private ArrayList<Computador> listaDeComputadores = new ArrayList<>();

    // Aqui temos a composição!
    public Laboratorio(String nomeLaboratorio, ArrayList<Computador> listaDeComputadores) {
        this.nomeLaboratorio = nomeLaboratorio;
        this.listaDeComputadores = listaDeComputadores;
    }

    public String getNomeLaboratorio() {
        return nomeLaboratorio;
    }

    public ArCondicionado getArCondicionado() {
        return arCondicionado;
    }

    public ArrayList<Computador> getListaDeComputadores() {
        return listaDeComputadores;
    }

    // AQUI TEMOS A ASSOCIAÇÃO, justamente por que o AR CONDICIONADO É OPCIONAL DENTRO DO LABORATORIO!
    public void setArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void exibirDetalhesLaboratorio() {
        int quantidadeDeAlunos = 0;

        for (Computador computador : listaDeComputadores) {
            quantidadeDeAlunos += computador.quantidadeDeAlunos();

            System.out.println("Modelo do computador: " + computador.getModelo());
            System.out.println("Quantidade de alunos usando este computador: " + computador.quantidadeDeAlunos());
        }

        if (quantidadeDeAlunos > this.listaDeComputadores.size()) {
            System.out.println("O laboratorio não possui computadores suficientes para todos os alunos!");
        }

        if (quantidadeDeAlunos == this.listaDeComputadores.size()) {
            System.out.println("O laboratorio possui a quantidade exata de computadores e alunos!");
        }

        if (this.listaDeComputadores.size() > quantidadeDeAlunos) {
            System.out.println("O laboratorio possui computadores suficientes para todos os alunos!");
        }

        if (this.arCondicionado != null){
            System.out.println("O ar condicionado do laboratorio é da marca: " + this.arCondicionado.getMarca() + " e a ligado na temperatura : " + this.arCondicionado.getTemperatura());
        } else {
            System.out.println("O laboratorio não possui ar condicionado!");
        }
    }
}
