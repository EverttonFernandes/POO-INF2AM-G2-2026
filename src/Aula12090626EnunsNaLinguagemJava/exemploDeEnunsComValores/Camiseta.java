package Aula12090626EnunsNaLinguagemJava.exemploDeEnunsComValores;


public class Camiseta {
    private TamanhoCamiseta tamanhoCamiseta;
    private boolean temEstampa;
    private String marca;

    public Camiseta(TamanhoCamiseta tamanhoCamiseta, boolean temEstampa, String marca) {
        this.tamanhoCamiseta = tamanhoCamiseta;
        this.temEstampa = temEstampa;
        this.marca = marca;
    }

    public TamanhoCamiseta getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    public boolean isTemEstampa() {
        return temEstampa;
    }

    public String getMarca() {
        return marca;
    }

    public void exibirInformacoes() {
        System.out.println("O tamanho da camiseta é : " + this.tamanhoCamiseta.getDescricao());
        System.out.println("A marca da camiseta é : " + this.marca);

        if (this.temEstampa) {
            System.out.println("A camiseta possui estampa!");
        } else {
            System.out.println("A camiseta não possui estampa!");
        }
    }
}
