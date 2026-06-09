package Aula12090626EnunsNaLinguagemJava.exemploDeEnunsComValores;

public enum TamanhoCamiseta {
    PP("muito pequeno", '1'),
    P("pequena", '2'),
    M("média", '3'),
    G("grande", '4'),
    GG("Super grande", '5'),
    XXG("Extra grande", '6');

    private final String descricao;
    private final char id;

    TamanhoCamiseta(String descricao, char id) {
        this.descricao = descricao;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getId() {
        return id;
    }
}
