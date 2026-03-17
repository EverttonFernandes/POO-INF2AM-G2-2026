package Aula03Dia1703ConstrutoresVisibilidadePublicaEPrivadaGettersESetters.Exemplo;

public class Main {
    // psvm + tab
    public static void main(String[] args) {
        Pessoa maria = new Pessoa("Maria", 20, "123.456.789-00", "Rua das Flores, 123");

        System.out.println("Nome: " + maria.getNome());
        System.out.println("Idade: " + maria.getIdade());
        System.out.println("CPF: " + maria.getCpf());
        System.out.println("Endereço: " + maria.getEndereco());

        // E SE A MARIA MUDAR DE ENDEREÇO COMO QUE A GENTE FAZ?
        System.out.println("####MOSTRANDO NOVO ENDERECO DA MARIA####");
        maria.setEndereco("Novo endereço, 456");
        System.out.println("Endereço: " + maria.getEndereco());
    }
}
