package AulaPratica10Dia2306ResolucaoDosExerciciosPreparatoriosParaProva.Exercicio7;

public class Main {
    public static void main(String[] args) {
        Equipamento martelo = new Equipamento("Martelo", "12345", "Almoxarifado");
        Equipamento alicate = new Equipamento("Alicate", "56789", "Almoxarifado");
        Equipamento carrinhoDeMao = new Equipamento("CarrinhoDeMao", "12987", "Almoxarifado");

        CadastroDeEquipamentos cadastroDeEquipamentos = new CadastroDeEquipamentos();
        cadastroDeEquipamentos.adicionarEquipamento(martelo);
        cadastroDeEquipamentos.adicionarEquipamento(alicate);
        cadastroDeEquipamentos.adicionarEquipamento(carrinhoDeMao);

        cadastroDeEquipamentos.listarTodosOsEquipamentos();
        cadastroDeEquipamentos.buscarEquipamentoPeloCodigoDePatrimonio(martelo);
        cadastroDeEquipamentos.atualizarSetorDoEquipamento(martelo.getCodigoPatrimonio(), "Manuteção");

        cadastroDeEquipamentos.removerEquipamentoPeloCodigo(martelo.getCodigoPatrimonio());
    }
}
