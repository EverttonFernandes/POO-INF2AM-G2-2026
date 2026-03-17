package Aula03Dia1703ConstrutoresVisibilidadePublicaEPrivadaGettersESetters.Exemplo;

public class Pessoa {
    // TODOS OS OBJETOS ELES POSSUEM ATRIBUTOS (QUE SÃO AS SUAS CARACTERISTICAS)
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    // O MÉTODO CONSTRUTOR NÓS USAMOS PARA DAR VIDA AO OBJETO, SEM ELE NÃO CONSEGUIMOS INICIALIZAR O OBJETO!

    public Pessoa(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // OS MÉTODOS GETTERS SÃO USADOS PARA QUE POSSAMOS FORNECER O ACESSO AOS ATRIBUTOS PRIVADOS DE UM DETERMINADO OBJETO
    // QUANDO OS ATRIBUTOS SÃO PRIVADOS O ACESSO APENAS FICA DENTRO DO PRÓPRIO OBJETO
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    // QUANDO PRECISAMOS ALTERAR UM ATRIBUTO QUE É PRIVADO, NÓS CONSEGUIMOS FAZER ISSO
    // UNICA E EXCLUSIVAMENTE POR MEIO DE MÉTODOS SETTERS!


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
