package Aula02.Dia0303ComecandoComJava.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usando a biblioteca Scanner, informem 3 numeros. E depois digam qual desses numeros é o maior?

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Informe o primeiro numero: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Informe o primeiro numero: ");
        int terceiroNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("O primeiro numero é o maior " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("O segundo numero é o maior " + primeiroNumero);
        } else if (terceiroNumero > segundoNumero && terceiroNumero > primeiroNumero) {
            System.out.println("O terceiro numero é o maior " + primeiroNumero);
        } else {
            System.out.println("Os numeros são iguais!");
        }

    }
}
