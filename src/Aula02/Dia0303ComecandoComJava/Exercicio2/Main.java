package Aula02.Dia0303ComecandoComJava.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usando o scanner, informe 1 numero e depois usando um for some 1 até o numero informado.
        // Exemplo: se o usuario digitar 3 o resultado deve ser 6 (1 + 2 + 3 = 6)
        // use uma variavel total para acumular na soma usando o operador +=
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numeroInformado = scanner.nextInt();

        int somaTotal = 0;

        for (int indice = 1; indice <= numeroInformado; indice++) {
            somaTotal += indice;
        }

        System.out.println("O total acumulado entre 1 até o numero informado foi: " + somaTotal);
    }
}
