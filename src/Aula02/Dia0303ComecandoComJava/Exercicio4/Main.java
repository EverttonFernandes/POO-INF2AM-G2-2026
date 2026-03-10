package Aula02.Dia0303ComecandoComJava.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numeroInformado = scanner.nextInt();

        int totalDeNumerosPares = 0;

        for (int indice = 1; indice <= numeroInformado; indice++) {
            if (indice % 2 == 0) {
                totalDeNumerosPares++;
            }
        }

        System.out.println("O total de numeros pares de 1 até o numero informado eh: " + totalDeNumerosPares);
    }
}
