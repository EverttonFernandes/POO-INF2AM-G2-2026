package Aula043103ListaPratica.ListaoPratico.Exe3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Acai acaiGrande = new Acai("Grande", 28.00);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá me diga quantos sabores tu deseja adicionar?");
        int quantidadeDeSaboresQueOUsuarioDesejaColocarNoAcai = scanner.nextInt();

        scanner.nextLine(); // usamos para limpar o lixo que o caracter ENTER deixou no teclado

        for (int indice = 1; indice <= quantidadeDeSaboresQueOUsuarioDesejaColocarNoAcai; indice++) {
            System.out.println("Informe o nome do sabor: " + (indice));
            String saborInformado = scanner.nextLine();
            acaiGrande.inserirSabor(saborInformado);
        }

        acaiGrande.exibirInformacoes();
        scanner.close();
    }
}
