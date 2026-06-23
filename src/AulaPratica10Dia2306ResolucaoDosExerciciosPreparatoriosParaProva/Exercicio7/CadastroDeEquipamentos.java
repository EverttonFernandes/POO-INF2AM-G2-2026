package AulaPratica10Dia2306ResolucaoDosExerciciosPreparatoriosParaProva.Exercicio7;

import AulaPratica10Dia2306ResolucaoDosExerciciosPreparatoriosParaProva.Exercicio6.Aluno;

import java.util.ArrayList;

public class CadastroDeEquipamentos {
    private ArrayList<Equipamento> listaDeEquipamentos = new ArrayList<>();

    public void adicionarEquipamento(Equipamento equipamento) {
        this.listaDeEquipamentos.add(equipamento);
    }

    public void listarTodosOsEquipamentos() {
        System.out.println("############# EQUIPAMENTOS CADASTRADOS #############");
        for (Equipamento equipamentoDaLista : this.listaDeEquipamentos) {
            System.out.println("Nome do(a) equipamento(a): " + equipamentoDaLista.getNome());
            System.out.println("Codigo de patrimônio do(a) equipamento(a): " + equipamentoDaLista.getCodigoPatrimonio());
            System.out.println("Setor do(a) equipamento(a): " + equipamentoDaLista.getSetor());
            System.out.println("----------------------------");
        }
    }

    public void buscarEquipamentoPeloCodigoDePatrimonio(Equipamento equipamentoASerEncontrado) {
        boolean encontrou = false;
        for (Equipamento equipamento : this.listaDeEquipamentos) {
            if (equipamento.getCodigoPatrimonio().equals(equipamentoASerEncontrado.getCodigoPatrimonio())) {
                System.out.println("SUCESSO: O(a) equipamento " + equipamentoASerEncontrado.getNome() + " foi encontrado com sucesso!");
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("ERROR: O(a) equipamento " + equipamentoASerEncontrado.getNome() + " não foi encontrado!");
        }

    }

    public void atualizarSetorDoEquipamento(String codigoPatrimonio, String novoSetorInformado) {
        boolean encontrou = false;
        for (Equipamento equipamento : this.listaDeEquipamentos) {
            if (equipamento.getCodigoPatrimonio().equals(codigoPatrimonio)) {
                String antigoSetor = equipamento.getSetor();
                equipamento.setSetor(novoSetorInformado);
                System.out.println("O equipamento " + equipamento.getNome() + " com o código de patrimonio "
                        + codigoPatrimonio
                        + " saiu do seu antigo setor "
                        + antigoSetor
                        + " e agora foi para o setor "
                        + novoSetorInformado);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("ERROR: O(a) equipamento com o código de patrimonio " + codigoPatrimonio + " não foi encontrado!");
        }
    }

    public void removerEquipamentoPeloCodigo(String codigoPatrimonio) {
        if (this.listaDeEquipamentos.removeIf(equipamentoDaLista -> equipamentoDaLista.getCodigoPatrimonio().equals(codigoPatrimonio))) {
            System.out.println("SUCESSO: O(a) equipamento com o codigo de patrimonio " + codigoPatrimonio + " foi removido com sucesso!");
        } else {
            System.out.println("ERROR: O(a) equipamento com o codigo de patrimonio " + codigoPatrimonio + " não foi removido com sucesso!");
        }
    }
}
